package com.cv.app.service;

import com.cv.app.model.Profile;
import com.cv.app.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Optional<Profile> getProfileById(Long id) {
        return profileRepository.getProfileById(id);
    }
}
