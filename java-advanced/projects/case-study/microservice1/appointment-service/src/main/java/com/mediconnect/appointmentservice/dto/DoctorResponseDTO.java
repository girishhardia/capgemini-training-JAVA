package com.mediconnect.appointmentservice.dto;

import lombok.Data;

@Data
public class DoctorResponseDTO {
    private Long doctorId;
    private String name;
    private String specialization;
}
