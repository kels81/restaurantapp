package com.app.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false, updatable = false)
    private Long idUsuario;

    @Column(name = "nombre_usuario", length = 50, nullable = false)
    private String nombreUsuario;

    @Column(name = "password_usuario", length = 10, nullable = false)
    private String passwordUsuario;

    @Column(name = "rol_usuario", length = 50, nullable = false)
    private String rolUsuario;

    @Column(name = "activo", nullable = false)
    private Boolean activo;


}
