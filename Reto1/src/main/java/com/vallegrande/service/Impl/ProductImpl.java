package com.vallegrande.service.Impl;

import com.vallegrande.model.Product;
import com.vallegrande.repository.ProductRepository;
import com.vallegrande.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listarTodos() {
        return productRepository.findAll();
    }

    @Override
    public Product crear(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
     productRepository.deleteById(id);
    }
}
