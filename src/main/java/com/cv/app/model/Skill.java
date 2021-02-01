package com.cv.app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class Skill extends BaseEntity {
    private String title;
    private Integer percentage;
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

    public Skill() {
    }

    public Skill(String title, Integer percentage, Profile profile) {
        this.title = title;
        this.percentage = percentage;
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
