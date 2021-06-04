package com.example.jpademo.service;

import com.example.jpademo.model.Product;
import com.example.jpademo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public void save(Product product) {
        repository.save(product);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
