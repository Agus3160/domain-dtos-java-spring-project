package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;

@Data
public class BeneficioDto extends BaseDto {
    private BigDecimal porcentaje_de_sueldo;
    private String nombre;
    private boolean activo;
    private LocalDateTime fecha_inicio;
    private LocalDateTime fecha_fin;
}
