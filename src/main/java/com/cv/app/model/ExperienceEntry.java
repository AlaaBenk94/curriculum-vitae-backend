package com.cv.app.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class ExperienceEntry extends BaseTimelineEntry {
    private LocalDate startDate;
    private LocalDate endDate;
    private String tags; // separated by comma ','

    public ExperienceEntry() {
    }

    public ExperienceEntry(LocalDate startDate, LocalDate endDate, String tags) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.tags = tags;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
