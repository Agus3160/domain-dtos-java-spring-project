package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class EmpleadoDto extends BaseDto{
    private int user_id;
    private int puesto_id;
    private String ci;
    private String nombre;
}
