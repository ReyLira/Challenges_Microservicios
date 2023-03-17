package com.example.vallegrande.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "certificated")
@Data
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "institucion",length = 50,nullable = false)
    private String institucion;

    @Column(name = "date",length = 50,nullable = false)
    private String date;

    @Column(name = "price",length = 50, nullable = false)
    private String price;

}
