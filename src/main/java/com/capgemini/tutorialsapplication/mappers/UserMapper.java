package com.capgemini.tutorialsapplication.mappers;

import com.capgemini.tutorialsapplication.entities.User;
import com.capgemini.tutorialsapplication.entities.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(ignore = true, target = "email")
    @Mapping(ignore = true, target = "age")
    UserDTO getDTOFromEntity(User user);
    User getEntityFromDTO(UserDTO userDTO);
}
