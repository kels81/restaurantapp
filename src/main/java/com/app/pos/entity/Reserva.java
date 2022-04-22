package com.app.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 16, unique = true, nullable = false)
    private Long idReservacion;

    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;

    @Column(name = "id_mesa", nullable = false)
    private Long idMesa;

    @Column(name = "id_establecimiento", nullable = false)
    private Long idEstablecimiento;

    @Column(name = "fecha_reserva", nullable = false)
    private LocalDateTime fechaReservacion;

}
