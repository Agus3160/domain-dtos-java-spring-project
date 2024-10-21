package com.fiuni.distri.project.fiuni.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serial;
import java.time.LocalDateTime;

@Entity
@Table(name = "Empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "puesto_id", nullable = false)
    private Puesto puesto;

    @Column(nullable = false, unique = true)
    private String ci;

    @Column(nullable = false)
    private String nombre;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(nullable = true)
    private LocalDateTime deletedAt;
}