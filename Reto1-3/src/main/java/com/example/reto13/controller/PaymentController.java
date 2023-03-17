package com.example.reto13.controller;

import com.example.reto13.model.Payment;
import com.example.reto13.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ms-product/v1/payment")
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;
    @GetMapping
    public List<Payment> listar() {
        return paymentRepository.findAll();
    }
    @PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentRepository.save(payment);
    }


    @PutMapping
    public Payment update(@RequestBody Payment payment){
        return paymentRepository.save(payment);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        paymentRepository.deleteById(id);
    }
}
