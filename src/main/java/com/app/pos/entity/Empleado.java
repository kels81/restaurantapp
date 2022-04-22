package com.app.pos.entity;

import com.app.pos.entity.enums.CargoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private Long idEmpleado;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombreEmpleado;

    @Column(name = "apellidos", length = 120, nullable = false)
    private String apellidosEmpleado;

    @Column(name = "direccion", length = 180)
    private String direccionEmpleado;

    @Column(name = "telefono", length = 10, nullable = false)
    private Long telefonoEmpleado;

    @Column(name = "cargo", length = 10, nullable = false)
    private CargoEnum cargoEmpleado;

    @Column(name = "id_establecimiento", length = 10, nullable = false)
    private Long idEstablecimiento;
}
