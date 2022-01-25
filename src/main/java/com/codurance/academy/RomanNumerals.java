package com.codurance.academy;

public class RomanNumerals {
    public String convert(int decimalNumber) {
        if(decimalNumber == 5){
            return "V";
        }
        if(decimalNumber == 6){
            return "VI";
        }
        if(decimalNumber == 7){
            return "VII";
        }

        StringBuilder output = new StringBuilder();


        for( var i = 0; i< decimalNumber; i++){
            output.append("I");
        }

        return output.toString();

    }
}
