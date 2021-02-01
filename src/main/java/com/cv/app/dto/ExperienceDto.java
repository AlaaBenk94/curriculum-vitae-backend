package com.cv.app.dto;

import java.time.LocalDate;

public class ExperienceDto extends AbstractTimelineDto {
    private LocalDate startDate;
    private LocalDate endDate;
    private String tags;

    public ExperienceDto() {
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
