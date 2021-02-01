package com.cv.app.repository;

import com.cv.app.model.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends CrudRepository<Skill, Long> {
    List<Skill> findAllByProfileId(Long profileId);
}
