package com.RickMorty.P3.controller;

import com.RickMorty.P3.DTO.HappyNumberDTO;
import com.RickMorty.P3.service.P3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class P3Controller {

    @Autowired
    private P3Service p3Service;

    @PostMapping(value = "/happy",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HappyNumberDTO>> areHappyArray(@Valid @RequestBody List<HappyNumberDTO> happyNumberDTOList) {
        return new ResponseEntity<>(p3Service.areHappyArray(happyNumberDTOList), HttpStatus.OK);
    }
}
