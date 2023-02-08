package com.RickMorty.P2.DTO;

import com.RickMorty.P2.model.Location;

public class LocationDTO {

    private Long id;
    private String name;
    private String type;
    private String dimension;
    private String url;

    public LocationDTO() {
    }

    public LocationDTO(Location location) {
        this.id = location.getId();
        this.name = location.getName();
        this.type = location.getType();
        this.dimension = location.getDimension();
        this.url = location.getUrl();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
