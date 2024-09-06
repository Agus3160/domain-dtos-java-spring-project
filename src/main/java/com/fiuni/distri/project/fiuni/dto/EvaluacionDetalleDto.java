package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class EvaluacionDetalleDto {
    private int evaluacion_id;
    private int criterio;
    private int puntaje;
    private String comentarios;
}
