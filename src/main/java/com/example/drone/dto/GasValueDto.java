package com.example.drone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GasValueDto {
    private Double gas1;
    private Double gas2;
    private Float temperature;
}
