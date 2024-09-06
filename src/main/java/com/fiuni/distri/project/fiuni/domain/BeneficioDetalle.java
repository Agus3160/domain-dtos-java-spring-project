package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.math.BigDecimal;

@Entity
@Table(name = "Beneficio_Detalle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeneficioDetalle implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private BigDecimal monto;

    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "beneficio_id", nullable = false)
    private Beneficio beneficio;

    @Column(nullable = false)
    private Boolean activo;
}
