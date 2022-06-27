package com.altice.alticcisequence.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AlticciNumberSevice {
    Map<Integer,Integer> resultsMAP1 = new HashMap<Integer,Integer>();
    Map<Integer,Integer> resultsMAP2 = new HashMap<Integer,Integer>();


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
        boolean isParamGood = false;
        int AlticciNumber = param1+param2;





        while(!isParamGood) {

        param1 = this.calculateAlticciLessOrEqualToTwo(param1);
            if (param1 > 2) {
                if(!resultsMAP1.containsKey(param1)) {
                    int paramBefore = param1;
                    param1 = this.calculateAlticciBiggerThanTwo(param1);
                    System.out.println("param1 agora é = "+ param1);
                    resultsMAP1.put(paramBefore,param1);
                    System.out.println(resultsMAP1);
                }
                else {
                    param1 = resultsMAP1.get(param1);
                    System.out.println("Continha key" + param1);
                }

            }


        param2 = this.calculateAlticciLessOrEqualToTwo(param2);
            if (param2 > 2) {
                if(!resultsMAP2.containsKey(param2)) {
                    int paramBefore = param2;
                    param2 = this.calculateAlticciBiggerThanTwo(param2);
                    System.out.println("param1 agora é = "+ param2);
                    resultsMAP1.put(paramBefore,param2);
                    System.out.println(resultsMAP2);
                }
                else {
                    param2 = resultsMAP1.get(param2);
                    System.out.println("Continha key" + param2);
                }
            }
        isParamGood= true;

}
        AlticciNumber = this.calculateAlticiNumber(param1,param2);
        System.out.println("------------------------");
        return AlticciNumber;
    }

    public int calculateParam1(Integer numberInput){
           return  numberInput - 3;
    }


    public int calculateParam2(Integer numberInput){
            return  numberInput - 2;
    }

    public int calculateAlticiNumber(Integer param1,Integer param2 ){
        int bol = param1 + param2;
        System.out.println("calcuando param1"+ "(" + param1 + ")" + "calcuando param2"+ "(" + param2 + ")");
        System.out.println("Resultado "+ bol);
        return param1 + param2;
    }


    /*
       param1 = this.calculateAlticciLessOrEqualToTwo(param1);
            if (param1 > 2) {
                System.out.println("calculando param2 quando ele é = " + param1);
                param1 = this.calculateAlticciBiggerThanTwo(param1);
                System.out.println("param2 agora é = "+ param1);
            }


        param2 = this.calculateAlticciLessOrEqualToTwo(param2);
            if (param2 > 2) {
                System.out.println("calculando param2 quando ele é = " + param2);
                param2 = this.calculateAlticciBiggerThanTwo(param2);
                System.out.println("param2 agora é = "+ param1);
            }
     */



}
