package com.cv.app.mapper;

import com.cv.app.dto.SkillDto;
import com.cv.app.model.Skill;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDto Skill2SkillDto(Skill skill);

    Skill skillDto2Skill(SkillDto skillDto);
}
