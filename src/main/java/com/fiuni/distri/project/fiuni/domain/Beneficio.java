package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Beneficios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Beneficio implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Beneficios_id_seq")
    private Long id;

    @Column(nullable = false)
    private BigDecimal porcentajeDeSueldo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Boolean activo;

    @Column(nullable = false)
    private LocalDate fechaInit;

    @Column(nullable = false)
    private LocalDate fechaFin;
}
