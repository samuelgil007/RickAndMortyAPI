package com.RickMorty.P3.DTO;


import javax.validation.constraints.NotNull;

public class HappyNumberDTO {

    @NotNull(message = "El number no puede ser null")
    private Integer number;

    private String isHappy;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getIsHappy() {
        return isHappy;
    }

    public void setIsHappy(String isHappy) {
        this.isHappy = isHappy;
    }

    @Override
    public String toString() {
        return "HappyNumberDTO{" +
                "number=" + number +
                ", isHappy='" + isHappy + '\'' +
                '}';
    }
}
