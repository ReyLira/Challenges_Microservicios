package com.vallegrande.service;

import com.vallegrande.model.Product;

import java.util.List;

public interface ProductService {
    List <Product> listarTodos();

    Product crear(Product product);

    Product update(Product product);

    void delete(Integer id);
}
