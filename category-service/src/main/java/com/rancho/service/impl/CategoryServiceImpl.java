package com.rancho.service.impl;

import com.rancho.dto.SalonDTO;
import com.rancho.modal.Category;
import com.rancho.repository.CategoryRepository;
import com.rancho.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public Category saveCategory(Category category, SalonDTO salonDTO) {
        Category newCategory=new Category();
        newCategory.setName(category.getName());
        newCategory.setSalonId(salonDTO.getId());
        newCategory.setImage(category.getImage());

        return categoryRepository.save(newCategory);
    }

    @Override
    public Set<Category> getAllCategoryBySalon(Long id) {
        return categoryRepository.findBySalonId(id);
    }

    @Override
    public Category getCategoryById(Long id) {
        Category category=categoryRepository
        return ;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }
}
