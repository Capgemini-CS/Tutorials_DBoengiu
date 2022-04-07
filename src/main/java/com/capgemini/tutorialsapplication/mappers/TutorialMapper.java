package com.capgemini.tutorialsapplication.mappers;

import com.capgemini.tutorialsapplication.entities.Tutorial;
import com.capgemini.tutorialsapplication.entities.dto.TutorialDTO;
import org.mapstruct.Mapper;

@Mapper
public interface TutorialMapper {
    TutorialDTO getDTOFromEntity(Tutorial tutorial);
    Tutorial getEntityFromDTO(TutorialDTO tutorialDTO);
}
