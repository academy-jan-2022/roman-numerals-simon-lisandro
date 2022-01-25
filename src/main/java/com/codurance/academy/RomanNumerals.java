package com.codurance.academy;

public class RomanNumerals {
    public String convert(int decimalNumber) {
        StringBuilder output = new StringBuilder();
        var buffer = decimalNumber;

        if(decimalNumber >= 5){
            output.append("V");
            buffer -= 5;
        }


        for( var i = 0; i< buffer; i++){
            output.append("I");
        }

        return output.toString();

    }
}
