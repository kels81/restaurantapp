package com.app.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Platillo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private Long idPlatillo;

    @Column(name = "nombre", length = 120, nullable = false)
    private String nombrePlatillo;

    @Column(name = "descripcion", length = 120, nullable = false)
    private String descripcionPlatillo;

//    @Column(name = "tiempo", length = 120, nullable = false)
//    private Long tiempoPlatillo;

    @Column(name = "precio", nullable = false, precision = 18, scale = 2)
    private BigDecimal precioPlatillo;

//    @Column(name = "imagen")
//    private Archivo imagenPlatillo;


}
