package com.RickMorty.P1.service;

import com.RickMorty.P1.model.Character;
import com.RickMorty.P1.model.Episode;
import com.RickMorty.P1.model.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class P1Service {

    @Value("${rickmorty.uri}")
    private String rickMortyAPI;

    public Episode findEpisodeById(String id) {
        Episode episode;
        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri(rickMortyAPI)
                .build();
        episode = restTemplate.getForObject("/{id}", Episode.class, id);

        List<Character> characterList = new ArrayList<>();
        for (Character character : episode.getCharacters()) {
            character = findCharacterInfo(character.getUrl());
            character.setLocation(findLocationInfo(character.getLocation().getUrl()));
            characterList.add(character);
        }
        episode.setCharacters(characterList);
        return episode;
    }

    private Character findCharacterInfo(String url) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri(url)
                .build();
        return restTemplate.getForObject("/", Character.class);
    }

    private Location findLocationInfo(String url) {
        if (url.equals("")) {
            return null;
        }

        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri(url)
                .build();
        return restTemplate.getForObject("/", Location.class);
    }
}
