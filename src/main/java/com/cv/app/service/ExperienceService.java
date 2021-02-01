package com.cv.app.service;

import com.cv.app.model.ExperienceEntry;
import com.cv.app.repository.ExperienceEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {

    private final ExperienceEntryRepository experienceEntryRepository;

    public ExperienceService(ExperienceEntryRepository experienceEntryRepository) {
        this.experienceEntryRepository = experienceEntryRepository;
    }

    public List<ExperienceEntry> getExperiences(Long profileId) {
        return experienceEntryRepository.getAllByProfileId(profileId);
    }

    public Optional<ExperienceEntry> getExperience(Long id) {
        return experienceEntryRepository.getById(id);
    }
}
