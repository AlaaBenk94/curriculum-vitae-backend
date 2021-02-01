package com.cv.app.repository;

import com.cv.app.model.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
    Optional<Profile> getProfileById(Long id);
}
