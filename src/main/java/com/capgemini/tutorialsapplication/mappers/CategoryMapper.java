package com.capgemini.tutorialsapplication.mappers;

import com.capgemini.tutorialsapplication.entities.Category;
import com.capgemini.tutorialsapplication.entities.dto.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

    CategoryDTO getDTOFromEntity(Category category);
    Category getEntityFromDTO(CategoryDTO categoryDTO);
}