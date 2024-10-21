package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class VacanteDto extends BaseDto{
    private int puesto_id;
    private boolean esta_disponible;
    private String descripcion;
}
