package com.RickMorty.P2.service;

import com.RickMorty.P2.DTO.LocationDTO;
import com.RickMorty.P2.model.Character;
import com.RickMorty.P2.model.Episode;
import com.RickMorty.P2.model.Location;
import com.RickMorty.P2.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class P2Service {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations(){
        return locationRepository.findAll();
    }

    public Location createLocation(LocationDTO locationDTO){
        return locationRepository.save(new Location(locationDTO.getName(), locationDTO.getType(),
                locationDTO.getDimension(),locationDTO.getUrl()));
    }
}
