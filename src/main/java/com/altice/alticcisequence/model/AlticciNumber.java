package com.altice.alticcisequence.model;


public class AlticciNumber {

    private Integer AlticciNumberResult;

    public AlticciNumber(Integer alticciNumberResult) {
        AlticciNumberResult = alticciNumberResult;
    }

    public long getNumber() {
        return AlticciNumberResult;
    }

    public void setNumber(int number) {
        this.AlticciNumberResult = number;
    }


}