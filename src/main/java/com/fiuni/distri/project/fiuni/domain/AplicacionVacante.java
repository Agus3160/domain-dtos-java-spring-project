package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Entity
@Table(name = "AplicacionVacante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AplicacionVacante implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vacante_id", nullable = false)
    private Vacante vacante;

    private String cv;

    @ManyToOne
    @JoinColumn(name = "encargado_id", nullable = false)
    private Empleado encargado;

    @Column(nullable = false)
    private Boolean fueRevisado;
}

