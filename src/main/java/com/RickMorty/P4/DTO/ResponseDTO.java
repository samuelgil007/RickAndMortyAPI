package com.RickMorty.P4.DTO;

public class ResponseDTO {

    private Integer result;

    public ResponseDTO(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
