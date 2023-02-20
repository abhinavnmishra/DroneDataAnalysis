package com.example.drone.models;

import com.example.drone.dto.GasValueDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GasValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Double gas1;
    private Double gas2;
    private Float temperature;

    public GasValue(GasValueDto dto){
        this.gas1 = dto.getGas1();
        this.gas2 = dto.getGas2();
        this.temperature = dto.getTemperature();
    }

}
