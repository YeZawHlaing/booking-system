package com.backend.booking.system.service;

import com.backend.booking.system.model.Category;

import java.util.List;

public interface CategoryService {

    //S createCategory(CategoryDTO cdto);

    Category createCategory(Category c);
    List<Category> getAllCategorys();
    Category updateCategory(Category c, Long id);
    Category deleteCategory(Long id);
    //Category uploadImage(Category c,long id);
}
