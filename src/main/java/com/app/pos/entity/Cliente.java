package com.app.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private Long idCliente;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombreCliente;

    @Column(name = "apellidos", length = 120, nullable = false)
    private String apellidosCliente;

    @Column(name = "direccion", length = 180)
    private String direccionCliente;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefonoCliente;

}
