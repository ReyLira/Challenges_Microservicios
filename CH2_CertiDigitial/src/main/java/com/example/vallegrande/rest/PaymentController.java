package com.example.vallegrande.rest;

import com.example.vallegrande.domain.Payment;
import com.example.vallegrande.domain.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Challenge/v1/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping
    public List<Payment> listar() {
        return paymentService.listartodos();
    }
    @PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentService.save(payment);
    }

    @PutMapping
    public Payment update(@RequestBody Payment payment){
        return paymentService.save(payment);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        paymentService.delete(id);
    }
}
