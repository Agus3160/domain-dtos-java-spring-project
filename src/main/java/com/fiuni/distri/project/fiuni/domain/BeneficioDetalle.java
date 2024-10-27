package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Beneficio_Detalle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeneficioDetalle implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private BigDecimal monto;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "beneficio_id", nullable = false)
    private Beneficio beneficio;

    @Column(nullable = false)
    private Boolean activo;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(nullable = true)
    private LocalDateTime deletedAt;
}
