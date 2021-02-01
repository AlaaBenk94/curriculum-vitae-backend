package com.cv.app.controller;

import com.cv.app.dto.ExperienceDto;
import com.cv.app.exception.ElementNotFoundException;
import com.cv.app.mapper.ExperienceMapper;
import com.cv.app.service.ExperienceService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/experiences")
public class ExperienceController {

    private final ExperienceService experienceService;
    private final ExperienceMapper experienceMapper;

    public ExperienceController(ExperienceService experienceService, ExperienceMapper experienceMapper) {
        this.experienceService = experienceService;
        this.experienceMapper = experienceMapper;
    }

    @GetMapping
    public List<ExperienceDto> getExperiences(@RequestParam(name = "profile_id") Long profileId) {
        return experienceService.getExperiences(profileId).stream()
                .map(experienceMapper::experience2experienceDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ExperienceDto getExperience(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return experienceService.getExperience(id)
                .map(experienceMapper::experience2experienceDto)
                .orElseThrow(ElementNotFoundException::new);
    }

}
