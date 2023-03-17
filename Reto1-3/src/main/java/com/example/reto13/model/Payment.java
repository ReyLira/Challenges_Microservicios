package com.example.reto13.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pagos")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpay;

    @Column(name = "nomcli",length = 50,nullable = false)
    private String nomcli ;

    @Column(name = "dni",length = 50,nullable = false)
    private String dni;

    @Column(name = "total",length = 50,nullable = false)
    private String total;
}
