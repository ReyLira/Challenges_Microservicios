package com.example.vallegrande.domain;

import java.util.List;

public interface PaymentService {

    List<Payment> listartodos();

    Payment save (Payment payment);

    Payment update (Payment payment);

    void delete (Integer id );
}
