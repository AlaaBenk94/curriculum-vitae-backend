package com.cv.app.controller;

import com.cv.app.dto.SkillDto;
import com.cv.app.mapper.SkillMapper;
import com.cv.app.service.SkillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/skills")
public class SkillController {

    private final SkillService skillService;
    private final SkillMapper skillMapper;

    public SkillController(SkillService skillService, SkillMapper skillMapper) {
        this.skillService = skillService;
        this.skillMapper = skillMapper;
    }

    @GetMapping
    List<SkillDto> getSkills(@RequestParam(name = "profile_id") Long profileId) {
        return skillService.getSkills(profileId).stream()
                .map(skillMapper::Skill2SkillDto)
                .collect(Collectors.toList());
    }
}
