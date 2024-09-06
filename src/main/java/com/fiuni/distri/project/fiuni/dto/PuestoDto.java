package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PuestoDto extends BaseDto{
    private String nombre;
    private BigDecimal sueldo;
}
