package com.RickMorty.P2.controller;

import com.RickMorty.P2.DTO.LocationDTO;
import com.RickMorty.P2.model.Episode;
import com.RickMorty.P2.model.Location;
import com.RickMorty.P2.service.P2Service;
import com.RickMorty.P4.DTO.RequestDTO;
import com.RickMorty.P4.DTO.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class P2Controller {

    @Autowired
    private P2Service p2Service;

    @GetMapping(value = "/location/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Location>> getAll() {
        return new ResponseEntity<>(p2Service.getAllLocations(), HttpStatus.OK);
    }

    @PostMapping(value = "/location",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Location> createLocation(@RequestBody LocationDTO locationDTO) {
        return new ResponseEntity<>(p2Service.createLocation(locationDTO), HttpStatus.OK);
    }
}
