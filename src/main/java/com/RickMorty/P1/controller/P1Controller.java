package com.RickMorty.P1.controller;

import com.RickMorty.P1.model.Episode;
import com.RickMorty.P1.service.P1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class P1Controller {

    @Autowired
    private P1Service p1Service;

    @GetMapping(value = "/episode/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Episode findEpisodeById(@PathVariable(value = "id") String id) {
        return p1Service.findEpisodeById(id);
    }
}
