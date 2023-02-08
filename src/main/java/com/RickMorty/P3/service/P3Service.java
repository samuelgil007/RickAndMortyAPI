package com.RickMorty.P3.service;

import com.RickMorty.P3.DTO.HappyNumberDTO;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class P3Service {

    public List<HappyNumberDTO> areHappyArray(List<HappyNumberDTO> happyNumberDTOList){

        for(HappyNumberDTO happyNumber: happyNumberDTOList){
            if (happyNumber == null){
                happyNumber.setIsHappy("No es posible calcular si es feliz o no");
                continue;
            }
            if (happyNumber.getNumber() == null){
                happyNumber.setIsHappy("No es posible calcular si es feliz o no");
                continue;
            }
            if(isHappy(happyNumber.getNumber())){
                happyNumber.setIsHappy("true");
            }else{
                happyNumber.setIsHappy("false");
            }
        }

        return happyNumberDTOList;
    }

    private boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);
        return slow == 1;
    }

    private int digitSquareSum(int n) {
        int sum = 0, digit;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
