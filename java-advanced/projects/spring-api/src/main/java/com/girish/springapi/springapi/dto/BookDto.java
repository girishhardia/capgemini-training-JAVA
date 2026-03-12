package com.girish.springapi.springapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class BookDto {

    @NotBlank(message = "Book should not be blank")
    private  String title;

    @NotBlank(message = "Book should have an author")
    private String author;

    @NotBlank
    @Min(value = 100, message = "minimum ")
    private double price;
}
