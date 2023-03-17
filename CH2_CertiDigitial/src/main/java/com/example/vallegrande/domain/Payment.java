package com.example.vallegrande.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(name = "tipo",length = 50,nullable = false)
    private String tipo;
    @Column(name = "moneda",length = 50,nullable = false)
    private String moneda;
    @Column(name = "cuenta",length = 50,nullable = false)
    private String cuenta;
    @Column(name = "tarjeta",length = 50,nullable = false)
    private String tarjeta;
    @Column(name = "vencimiento",length = 50,nullable = false)
    private String vencimiento;
    @Column(name = "ccv",length = 50,nullable = false)
    private String ccv;
    @Column(name = "descripcion",length = 50,nullable = false)
    private String descripcion;

}
