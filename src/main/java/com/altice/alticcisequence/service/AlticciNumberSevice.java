package com.altice.alticcisequence.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AlticciNumberSevice {


    public Integer generateAlticciResponse(Integer numberInput){

        if (numberInput <= 2) {
            return this.calculateAlticciLessOrEqualToTwo(numberInput);
        } else {
            return this.calculateAlticciBiggerThanTwo(numberInput);
        }
    }
    @Cacheable("AlticciNumber")
    public Integer calculateAlticciLessOrEqualToTwo(Integer numberInput) {
        if (numberInput < 2) {
            return numberInput;
        } else if (numberInput == 2) {
            return 1;
        } else {
            return numberInput;
        }
    }



@Cacheable("AlticciNumber")
    public Integer calculateAlticciBiggerThanTwo(Integer numberInput) {

        int param1 = numberInput - 3;
        int param2 = numberInput - 2;

        boolean isParamGood = false;


        while(!isParamGood) {

        param1 = this.calculateAlticciLessOrEqualToTwo(param1);

            while (param1 > 2) {
                System.out.println("entrei 1");
                param1 = this.calculateAlticciBiggerThanTwo(param1);
            }

        param2 = this.calculateAlticciLessOrEqualToTwo(param2);
            while (param2 > 2) {
                System.out.println("entrei 2");
                param2 = this.calculateAlticciBiggerThanTwo(param2);
            }
        isParamGood= true;
}
        return param1 + param2;
    }

}
