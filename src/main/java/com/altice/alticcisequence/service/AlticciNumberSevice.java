package com.altice.alticcisequence.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlticciNumberSevice {


    public Integer generateAlticciResponse(Integer numberInput){

        if (numberInput <= 2) {
            return this.calculateAlticciLessOrEqualToTwo(numberInput);
        } else {
            return this.calculateAlticciBiggerThanTwo(numberInput);
        }
    }
  
    public Integer calculateAlticciLessOrEqualToTwo(Integer numberInput) {
        if (numberInput < 2) {
            return numberInput;
        } else if (numberInput == 2) {
            return 1;
        } else {
            return numberInput;
        }
    }




    public Integer calculateAlticciBiggerThanTwo(Integer numberInput) {

;System.out.println("----- Calculando "+ numberInput + "----- ");
        int param1 =  calculateParam1(numberInput);
        int param2 =  calculateParam2(numberInput);
        int AlticciNumber = param1 + param2;

        boolean isParamGood = false;


        while(!isParamGood) {

        param1 = this.calculateAlticciLessOrEqualToTwo(param1);

            if (param1 > 2) {
                System.out.println("calculando param1 quando ele é = " + param1);
                param1 = this.calculateAlticciBiggerThanTwo(param1);
                System.out.println("param1 agora é = "+ param1);
            }

        param2 = this.calculateAlticciLessOrEqualToTwo(param2);
            if (param2 > 2) {
                System.out.println("calculando param2 quando ele é = " + param2);
                param2 = this.calculateAlticciBiggerThanTwo(param2);
                System.out.println("param2 agora é = "+ param1);
            }
        isParamGood= true;

}
        AlticciNumber = this.calculateAlticiNumber(param1,param2);
        System.out.println("------------------------");
        return AlticciNumber;
    }
    @Cacheable("calculateParam1(Integer numberInput)")
    public int calculateParam1(Integer numberInput){

        return numberInput - 3;
    }

    @Cacheable("calculateParam2")
    public int calculateParam2(Integer numberInput){
        return numberInput - 2;
    }

    public int calculateAlticiNumber(Integer param1,Integer param2 ){
        int bol = param1 + param2;
        System.out.println("calcuando param1"+ "(" + param1 + ")" + "calcuando param2"+ "(" + param2 + ")");
        System.out.println("Resultado "+ bol);
        return param1 + param2;
    }



}
