package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Category;
import com.examly.springapp.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category existing = categoryRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCategoryName(category.getCategoryName());
            return categoryRepository.save(existing);
        }
        return null;
    }

    @Override
    public Page<Category> getCategoriesWithPagination(int page, int size) {
        return categoryRepository.findAll(PageRequest.of(page, size));
    }
}