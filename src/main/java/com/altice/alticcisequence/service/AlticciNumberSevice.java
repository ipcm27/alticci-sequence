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
    @Cacheable("calculateAlticciIfLessEqualToTwo")
    public Integer calculateAlticciLessOrEqualToTwo(Integer numberInput) {
        if (numberInput < 2) {
            return numberInput;
        } else if (numberInput == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    public Integer calculateAlticciBiggerThanTwo(Integer numberInput) {
        int res1 = numberInput - 3;
        int res2 = numberInput - 2;
        int product = this.calcSum(res1, res2);

        if (res1 > 2) {
            while (res1 > 2) {
                res1 = this.calculateAlticciBiggerThanTwo(res1);
            }
        } else {
            res1 = this.calculateAlticciLessOrEqualToTwo(res1);
        }

        if (res2 > 2) {
            while (res2 > 2) {
                res2 = this.calculateAlticciBiggerThanTwo(res2);
            }
        } else {
            res2 = this.calculateAlticciLessOrEqualToTwo(res2);
        }
        product = this.calcSum(res1, res2);

        return product;
    }

    public int calcSum(Integer res1, Integer res2) {
        return res1 + res2;
    }
}
