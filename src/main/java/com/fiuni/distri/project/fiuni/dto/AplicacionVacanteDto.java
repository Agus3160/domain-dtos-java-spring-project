package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class AplicacionVacanteDto extends BaseDto{
    private int vacante_id;
    private String cv;
    private int encargado_id;
    private boolean fue_revisado;
}
