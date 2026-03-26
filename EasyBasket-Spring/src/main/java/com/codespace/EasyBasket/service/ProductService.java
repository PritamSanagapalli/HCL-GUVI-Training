package com.codespace.EasyBasket.service;

import com.codespace.EasyBasket.model.Product;
import com.codespace.EasyBasket.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }

    public Product save(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product product) {
        Product existing = repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Product Not found"));
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setDescription(product.getDescription());
        return repo.save(existing);
    }
}
