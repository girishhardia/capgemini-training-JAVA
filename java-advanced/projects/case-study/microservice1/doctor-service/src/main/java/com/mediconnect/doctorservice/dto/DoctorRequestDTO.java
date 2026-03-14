package com.mediconnect.doctorservice.dto;

import lombok.Data;

@Data
public class DoctorRequestDTO {
    private String name;
    private String specialization;
    private Integer experience;
    private String hospitalName;
    private String availability;
}
