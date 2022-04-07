package com.capgemini.tutorialsapplication.mappers;

import com.capgemini.tutorialsapplication.entities.Author;
import com.capgemini.tutorialsapplication.entities.dto.AuthorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AuthorMapper {
    @Mapping(ignore = true, target = "email")
    AuthorDTO getDTOFromEntity(Author author);
    Author getEntityFromDTO(AuthorDTO authorDTO);
}
