package com.cv.app.controller;

import com.cv.app.dto.FormationDto;
import com.cv.app.exception.ElementNotFoundException;
import com.cv.app.mapper.FormationMapper;
import com.cv.app.service.FormationService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/formations")
public class FormationController {

    private final FormationService formationService;
    private final FormationMapper formationMapper;

    public FormationController(FormationService formationService, FormationMapper formationMapper) {
        this.formationService = formationService;
        this.formationMapper = formationMapper;
    }

    @GetMapping
    List<FormationDto> getFormations(@RequestParam(name = "profile_id") Long profileId) {
        return formationService.getFormations(profileId).stream()
                .map(formationMapper::formation2formationDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    FormationDto getFormation(@PathVariable Long id) throws ChangeSetPersister.NotFoundException {
        return formationService.getFormation(id)
                .map(formationMapper::formation2formationDto)
                .orElseThrow(ElementNotFoundException::new);
    }

}
