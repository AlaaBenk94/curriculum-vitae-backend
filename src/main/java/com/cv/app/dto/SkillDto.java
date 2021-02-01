package com.cv.app.dto;

public class SkillDto {
    private Long id;
    private String title;
    private Integer percentage;

    public SkillDto() {
    }

    public SkillDto(Long id, String title, Integer percentage) {
        this.id = id;
        this.title = title;
        this.percentage = percentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
