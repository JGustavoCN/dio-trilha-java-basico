package me.dio.controller.dto;

import me.dio.domain.model.News;

public class NewsDto {
    private Long id;
    private String icon;
    private String description;

    public NewsDto() {
    }

    // Construtor com todos os campos
    public NewsDto(Long id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    // Construtor que aceita o modelo News
    public NewsDto(News model) {
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public News toModel() {
        News model = new News();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
