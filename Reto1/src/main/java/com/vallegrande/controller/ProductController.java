package com.vallegrande.controller;

import com.vallegrande.model.Product;
import com.vallegrande.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("ms-product/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> listar() {
        return productService.listarTodos();
    }
    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.crear(product);
    }


    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.crear(product);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        productService.delete(id);
    }


}
