package com.RickMorty.P4.service;

import com.RickMorty.P4.DTO.RequestDTO;
import com.RickMorty.P4.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class P4Service {

  public ResponseDTO sumNResponse(RequestDTO requestDTO){
      return new ResponseDTO(sumN(requestDTO.getNumber()));
  }

  public Integer sumN(Integer number){
      Integer n = 0;
      for (int i = 1; i <= number.intValue(); i++) {
          n+=i;
      }
      return n;
  }

}
