package me.dio.controller.dto;

import me.dio.domain.model.Feature;

public class FeatureDto {

    private Long id;
    private String icon;
    private String description;

    public FeatureDto() {
    }

    // Construtor com todos os campos
    public FeatureDto(Long id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }

    // Construtor que aceita o modelo Feature
    public FeatureDto(Feature model) {
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

    public Feature toModel() {
        Feature model = new Feature();
        model.setId(this.id);
        model.setIcon(this.icon);
        model.setDescription(this.description);
        return model;
    }
}
