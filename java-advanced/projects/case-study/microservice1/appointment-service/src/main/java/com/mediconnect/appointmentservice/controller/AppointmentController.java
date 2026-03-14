package com.mediconnect.appointmentservice.controller;

import com.mediconnect.appointmentservice.client.DoctorClient;
import com.mediconnect.appointmentservice.dto.AppointmentRequestDTO;
import com.mediconnect.appointmentservice.dto.AppointmentResponseDTO;
import com.mediconnect.appointmentservice.dto.DoctorResponseDTO;
import com.mediconnect.appointmentservice.entity.Appointment;
import com.mediconnect.appointmentservice.repository.AppointmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import feign.FeignException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorClient doctorClient;

    @PostMapping
    public ResponseEntity<?> createAppointment(@RequestBody AppointmentRequestDTO requestDTO) {
        try {
            // Validate doctor existence using Feign Client
            DoctorResponseDTO doctor = doctorClient.getDoctorById(requestDTO.getDoctorId());
            
            if (doctor == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Doctor not found");
            }

            Appointment appointment = new Appointment();
            BeanUtils.copyProperties(requestDTO, appointment);
            appointment.setStatus("CONFIRMED");
            Appointment savedAppointment = appointmentRepository.save(appointment);

            AppointmentResponseDTO responseDTO = new AppointmentResponseDTO();
            BeanUtils.copyProperties(savedAppointment, responseDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);

        } catch (FeignException.NotFound e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Doctor with ID " + requestDTO.getDoctorId() + " does not exist.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating appointment: " + e.getMessage());
        }
    }

    @GetMapping
    public List<AppointmentResponseDTO> getAllAppointments() {
        return appointmentRepository.findAll().stream()
                .map(appointment -> {
                    AppointmentResponseDTO dto = new AppointmentResponseDTO();
                    BeanUtils.copyProperties(appointment, dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentResponseDTO> getAppointmentById(@PathVariable Long id) {
        return appointmentRepository.findById(id)
                .map(appointment -> {
                    AppointmentResponseDTO dto = new AppointmentResponseDTO();
                    BeanUtils.copyProperties(appointment, dto);
                    return ResponseEntity.ok(dto);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelAppointment(@PathVariable Long id) {
        if (appointmentRepository.existsById(id)) {
            appointmentRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
