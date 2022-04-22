package com.app.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Establecimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private Long idEstablecimiento;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombreEstablecimiento;

    @Column(name = "direccion", length = 180, nullable = false)
    private String direccionEstablecimiento;

    @Column(name = "telefono", length = 10, nullable = false)
    private Long telefonoEstablecimiento;


}
