package com.cv.app.service;

import com.cv.app.model.Skill;
import com.cv.app.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getSkills(Long profileId) {
        return skillRepository.findAllByProfileId(profileId);
    }
}

