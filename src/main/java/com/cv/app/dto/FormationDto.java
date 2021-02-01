package com.cv.app.dto;

import java.time.LocalDate;

public class FormationDto extends AbstractTimelineDto {
    LocalDate date;

    public FormationDto() {
        super();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
