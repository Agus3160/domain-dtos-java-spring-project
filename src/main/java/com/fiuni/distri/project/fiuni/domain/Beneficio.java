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
import java.util.List;

@Entity
@Table(name = "Beneficios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficio implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private BigDecimal porcentaje_de_sueldo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo;

    @Column(nullable = false)
    private LocalDateTime fecha_inicio;

    @Column(nullable = false)
    private LocalDateTime fecha_fin;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(nullable = true)
    private LocalDateTime deletedAt;

    @OneToMany(mappedBy = "beneficio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BeneficioDetalle> detalles;
}
