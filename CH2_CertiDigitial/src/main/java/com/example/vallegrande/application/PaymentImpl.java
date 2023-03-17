package com.example.vallegrande.application;

import com.example.vallegrande.domain.Payment;
import com.example.vallegrande.domain.PaymentRepository;
import com.example.vallegrande.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> listartodos() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void delete(Integer id) {
        paymentRepository.deleteById(id);
    }
}
