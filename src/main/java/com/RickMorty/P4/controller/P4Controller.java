package com.RickMorty.P4.controller;

import com.RickMorty.P4.DTO.RequestDTO;
import com.RickMorty.P4.DTO.ResponseDTO;
import com.RickMorty.P4.service.P4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class P4Controller {

    @Autowired
    private P4Service p4Service;

    @PostMapping(value = "/suma",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> areHappyArray(@RequestBody RequestDTO requestDTO) {
        return new ResponseEntity<>(p4Service.sumNResponse(requestDTO), HttpStatus.OK);
    }
}
