package com.codurance.academy;

public class RomanNumerals {
    public String convert(int decimalNumber) {
        StringBuilder output = new StringBuilder();

        for( var i = 0; i< decimalNumber; i++){
            output.append("I");
        }

        return output.toString();

    }
}
