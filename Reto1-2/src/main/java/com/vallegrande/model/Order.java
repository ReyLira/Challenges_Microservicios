package com.vallegrande.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ordenes")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idord;

    @Column(name = "producto",length = 50,nullable = false)
    private String producto;

    @Column(name = "cantidad",length = 50,nullable = false)
    private String cantidad;


    @Column(name = "subtotal",length = 50,nullable = false)
    private String subtotal;
}
