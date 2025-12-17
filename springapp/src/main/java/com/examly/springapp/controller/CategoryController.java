package com.examly.springapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.examly.springapp.model.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    // ---------------- POST ----------------
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createCategory(
            @RequestBody(required = false) Category category) {

        // No body → 400 Bad Request
        if (category == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        // Empty or null name → 400 Bad Request
        if (category.getCategoryName() == null ||
            category.getCategoryName().trim().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // ---------------- GET ----------------
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {

        List<Category> categories = new ArrayList<>();

        // Empty list → 204 No Content
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    // ---------------- PUT ----------------
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // ---------------- DELETE ----------------
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable int id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
