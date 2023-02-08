package com.RickMorty.P3.model;

import java.util.List;

public class Episode {

    private String id;
    private String name;
    private String episode;
    private List<Character> characters;

    public Episode() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }


    @Override
    public String toString() {
        return "Episode{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", episode='" + episode + '\'' +
                ", characters=" + characters +
                '}';
    }
}
