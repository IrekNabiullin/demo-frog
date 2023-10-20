package org.nabii.demofrog.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FrogDto {
    private String name;
    private LocalDate birthDay;
}
