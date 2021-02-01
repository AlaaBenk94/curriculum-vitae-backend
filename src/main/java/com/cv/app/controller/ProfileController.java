package com.cv.app.controller;

import com.cv.app.dto.ProfileDto;
import com.cv.app.exception.ElementNotFoundException;
import com.cv.app.mapper.ProfileMapper;
import com.cv.app.service.ProfileService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {

    private final ProfileService profileService;
    private final ProfileMapper profileMapper;

    public ProfileController(ProfileService profileService, ProfileMapper profileMapper) {
        this.profileService = profileService;
        this.profileMapper = profileMapper;
    }

    @GetMapping("/{id}")
    public ProfileDto getProfile(@PathVariable("id") Long id) throws ChangeSetPersister.NotFoundException {
        return profileService.getProfileById(id)
                .map(profileMapper::profile2ProfileDto)
                .orElseThrow(ElementNotFoundException::new);
    }
}
