package com.cv.app.mapper;

import com.cv.app.dto.ExperienceDto;
import com.cv.app.model.ExperienceEntry;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExperienceMapper {
    ExperienceDto experience2experienceDto(ExperienceEntry experience);
}
