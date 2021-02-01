package com.cv.app.mapper;

import com.cv.app.dto.FormationDto;
import com.cv.app.model.FormationEntry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FormationMapper {
    FormationDto formation2formationDto(FormationEntry formation);
}
