package com.fiuni.distri.project.fiuni.dto;

import lombok.Data;

@Data
public class BeneficioDetalleDto extends BaseDto{
    private int beneficio_id;
    private double monto;
    private int empleado_id;
    private boolean activo;
}
