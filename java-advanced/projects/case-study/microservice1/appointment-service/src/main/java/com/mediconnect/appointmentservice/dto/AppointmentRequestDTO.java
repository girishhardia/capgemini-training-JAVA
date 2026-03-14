package com.mediconnect.appointmentservice.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AppointmentRequestDTO {
    private String patientName;
    private Long doctorId;
    private LocalDate appointmentDate;
}
