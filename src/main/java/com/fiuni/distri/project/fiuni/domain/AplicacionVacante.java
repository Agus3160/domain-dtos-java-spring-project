package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serial;
import java.time.LocalDateTime;

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
    private int id;

    @ManyToOne
    @JoinColumn(name = "vacante_id", nullable = false)
    private Vacante vacante;

    @Column(nullable = false)
    private String cv;

    @ManyToOne
    @JoinColumn(name = "encargado_id", nullable = false)
    private Empleado encargado;

    @Column(nullable = false)
    private Boolean fue_revisado;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

