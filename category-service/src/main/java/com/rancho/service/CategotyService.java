package com.rancho.service;

import com.rancho.dto.SalonDTO;
import com.rancho.modal.Category;

import java.util.Set;

public interface CategotyService {

    Category saveCategory(Category category, SalonDTO salonDTO);
    Set<Category> getAllCategoryBySalon(Long id);
    Category getCategoryById(Long id);
    void deleteCategoryById(Long id);
}
