package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Calendar;

@Data
public class EvaluacionDto extends BaseDto {
    private LocalDateTime fecha;
    private String descripcion;
    private double puntaje_general;
    private boolean pendiente;
    private int empleado_id;
}
