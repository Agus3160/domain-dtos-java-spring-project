package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class EvaluacionDetalleDto extends BaseDto {
    private int evaluacion_id;
    private String criterio;
    private int puntaje;
    private String comentarios;
}
