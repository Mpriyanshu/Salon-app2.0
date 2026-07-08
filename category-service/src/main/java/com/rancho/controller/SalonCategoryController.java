package com.rancho.controller;

import com.rancho.dto.SalonDTO;
import com.rancho.modal.Category;
import com.rancho.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories/salon-owner")
public class SalonCategoryController {

    private CategoryService categoryService;

    @PostMapping()
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {

        SalonDTO salonDTO=new SalonDTO();
        salonDTO.setId(1L);
        Category categories=categoryService.saveCategory(category,salonDTO);
        return ResponseEntity.ok(categories);
    }
}
