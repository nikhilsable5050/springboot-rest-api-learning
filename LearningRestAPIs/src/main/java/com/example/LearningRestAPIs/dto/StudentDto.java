package com.example.LearningRestAPIs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDto {
    private long id;
    private String name;
    private String email;

}
