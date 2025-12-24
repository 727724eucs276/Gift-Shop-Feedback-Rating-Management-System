
package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Product;
import com.examly.springapp.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existing = productRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setProductName(product.getProductName());
            existing.setPrice(product.getPrice());
            existing.setCategory(product.getCategory());
            return productRepo.save(existing);
        }
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryName(String categoryName) {
        return productRepo.findProductsByCategoryName(categoryName);
    }

    @Override
    public List<Product> getProductByName(String name) {
        return productRepo.findByProductName(name);
    }
    
@Override
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }


}

