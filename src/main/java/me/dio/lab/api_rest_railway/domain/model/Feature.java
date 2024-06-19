package me.dio.lab.api_rest_railway.domain.model;

public class Feature {
    private String icon;
    private String description;

    public Feature() {
    }

    public Feature(String description, String icon) {
        this.description = description;
        this.icon = icon;
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
}
