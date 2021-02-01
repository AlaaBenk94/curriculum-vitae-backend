package com.cv.app.repository;

import com.cv.app.model.ExperienceEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExperienceEntryRepository extends CrudRepository<ExperienceEntry, Long> {

    List<ExperienceEntry> getAllByProfileId(Long profileId);

    Optional<ExperienceEntry> getById(Long id);
    
}
