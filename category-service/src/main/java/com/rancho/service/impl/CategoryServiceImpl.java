package com.rancho.service.impl;

import com.rancho.dto.SalonDTO;
import com.rancho.modal.Category;
import com.rancho.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {




    @Override
    public Category saveCategory(Category category, SalonDTO salonDTO) {
        return null;
    }

    @Override
    public Set<Category> getAllCategoryBySalon(Long id) {
        return Set.of();
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }
}
