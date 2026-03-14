package com.mediconnect.doctorservice.controller;

import com.mediconnect.doctorservice.dto.DoctorRequestDTO;
import com.mediconnect.doctorservice.dto.DoctorResponseDTO;
import com.mediconnect.doctorservice.entity.Doctor;
import com.mediconnect.doctorservice.repository.DoctorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    public DoctorResponseDTO createDoctor(@RequestBody DoctorRequestDTO requestDTO) {
        Doctor doctor = new Doctor();
        BeanUtils.copyProperties(requestDTO, doctor);
        Doctor savedDoctor = doctorRepository.save(doctor);
        DoctorResponseDTO responseDTO = new DoctorResponseDTO();
        BeanUtils.copyProperties(savedDoctor, responseDTO);
        return responseDTO;
    }

    @GetMapping
    public List<DoctorResponseDTO> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctor -> {
                    DoctorResponseDTO dto = new DoctorResponseDTO();
                    BeanUtils.copyProperties(doctor, dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponseDTO> getDoctorById(@PathVariable Long id) {
        return doctorRepository.findById(id)
                .map(doctor -> {
                    DoctorResponseDTO dto = new DoctorResponseDTO();
                    BeanUtils.copyProperties(doctor, dto);
                    return ResponseEntity.ok(dto);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoctorResponseDTO> updateDoctor(@PathVariable Long id, @RequestBody DoctorRequestDTO requestDTO) {
        return doctorRepository.findById(id)
                .map(doctor -> {
                    BeanUtils.copyProperties(requestDTO, doctor, "doctorId");
                    Doctor updatedDoctor = doctorRepository.save(doctor);
                    DoctorResponseDTO dto = new DoctorResponseDTO();
                    BeanUtils.copyProperties(updatedDoctor, dto);
                    return ResponseEntity.ok(dto);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id) {
        if (doctorRepository.existsById(id)) {
            doctorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
