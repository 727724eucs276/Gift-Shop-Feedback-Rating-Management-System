
package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    // Day 12 – Get products by category name
    @Query("SELECT p FROM Product p WHERE p.category.categoryName = :categoryName")
    List<Product> findProductsByCategoryName(String categoryName);

    // Day 12 – Get product by name
    @Query("SELECT p FROM Product p WHERE p.productName = :name")
    List<Product> findByProductName(String name);
}

