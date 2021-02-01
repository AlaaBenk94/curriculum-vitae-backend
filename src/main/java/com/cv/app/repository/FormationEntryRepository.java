package com.cv.app.repository;

import com.cv.app.model.FormationEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormationEntryRepository extends CrudRepository<FormationEntry, Long> {

    List<FormationEntry> getAllByProfileId(Long profileId);

    Optional<FormationEntry> getById(Long id);

}
