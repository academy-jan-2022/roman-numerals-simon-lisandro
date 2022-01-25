package com.codurance.academy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static Map<Integer, String> decimalToRoman = Map.of(
        1, "I",
        4, "IV",
        5, "V",
        9, "IX",
        10, "X",
        14, "XIV",
        19, "XIX"

    );

    public String convert(int decimalNumber) {

        if (decimalToRoman.containsKey(decimalNumber))
            return decimalToRoman.get(decimalNumber);

        StringBuilder output = new StringBuilder();
        var buffer = decimalNumber;

        while(buffer >= 10){
            output.append(decimalToRoman.get(10));
            buffer -= 10;
        }

        while(buffer >= 5){
            output.append(decimalToRoman.get(5));
            buffer -= 5;
        }


        for( var i = 0; i< buffer; i++){
            output.append(decimalToRoman.get(1));
        }

        return output.toString();

    }
}
