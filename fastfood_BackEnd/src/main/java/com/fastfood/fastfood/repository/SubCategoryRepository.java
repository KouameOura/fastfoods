package com.fastfood.fastfood.repository;

import com.fastfood.fastfood.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {

    @Query("SELECT count(subcategory) from SubCategory subcategory")
    public Long countOfSubCategory();

    @Query("SELECT max(subcategory.subCategoryId) from SubCategory subcategory")
    public int getMaxOfSubCategoryId();


}