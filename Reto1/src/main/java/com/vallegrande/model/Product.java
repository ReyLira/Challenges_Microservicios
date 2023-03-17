package com.vallegrande.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="productos")
@Data
public class Product {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name",length = 50, nullable = false)
    private String name;

    @Column(name = "descripcion",length = 50, nullable = false)
    private String descripcion;


    @Column(name = "price",length = 50, nullable = false)
    private String price;


}

