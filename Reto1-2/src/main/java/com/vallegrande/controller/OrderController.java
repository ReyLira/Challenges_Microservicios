package com.vallegrande.controller;

import com.vallegrande.model.Order;
import com.vallegrande.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ms-product/v1/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping
    public List<Order> listar() {
        return orderRepository.findAll();
    }
    @PostMapping
    public Order create(@RequestBody Order order){
        return orderRepository.save(order);
    }


    @PutMapping
    public Order update(@RequestBody Order order){
        return orderRepository.save(order);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        orderRepository.deleteById(id);
    }
}
