package com.cv.app.model;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseTimelineEntry extends BaseEntity {
    protected String title;
    protected String Institution;
    protected String city;
    protected String country;
    protected String description;
    @ManyToOne(fetch = FetchType.LAZY)
    protected Profile profile;

    public BaseTimelineEntry() {
    }

    public BaseTimelineEntry(String title, String institution, String city, String country, String description, Profile profile) {
        this.title = title;
        Institution = institution;
        this.city = city;
        this.country = country;
        this.description = description;
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstitution() {
        return Institution;
    }

    public void setInstitution(String institution) {
        Institution = institution;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
