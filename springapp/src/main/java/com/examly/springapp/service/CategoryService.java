package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getAllCategories();

    // ✅ CHANGE int → Long
    Category getCategoryById(Long id);

    // ✅ CHANGE int → Long
    Category updateCategory(Long id, Category category);


    Page<Category> getCategoriesWithPagination(int page, int size);


}

