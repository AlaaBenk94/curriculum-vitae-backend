package com.cv.app.service;

import com.cv.app.model.FormationEntry;
import com.cv.app.repository.FormationEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private final FormationEntryRepository formationEntryRepository;

    public FormationService(FormationEntryRepository formationEntryRepository) {
        this.formationEntryRepository = formationEntryRepository;
    }

    public List<FormationEntry> getFormations(Long profileId) {
        return formationEntryRepository.getAllByProfileId(profileId);
    }

    public Optional<FormationEntry> getFormation(Long id) {
        return formationEntryRepository.getById(id);
    }
}
