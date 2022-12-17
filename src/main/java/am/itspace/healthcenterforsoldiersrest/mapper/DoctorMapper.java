package com.example.productcategoryservice.mapper;

import com.example.productcategoryservice.dto.CategoryPutRequestDto;
import com.example.productcategoryservice.dto.CategoryResponseDto;
import com.example.productcategoryservice.dto.CreateCategoryDto;
import com.example.productcategoryservice.model.Category;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category map(CreateCategoryDto createCategoryDto);

    CreateCategoryDto map(Category category);

    List<CategoryResponseDto> map(List<Category> categoryList);

    CreateCategoryDto map(Optional<Category> category);

    Category map(CategoryPutRequestDto categoryPutRequestDto);

    Category map(Integer value);


}
