package com.cv.app.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class FormationEntry extends BaseTimelineEntry {
    LocalDate date;

    public FormationEntry() {
    }

    public FormationEntry(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
