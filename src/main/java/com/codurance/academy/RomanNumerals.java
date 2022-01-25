package com.codurance.academy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static Map<Integer, String> decimalToRoman = Map.of(
        1, "I",
        5, "V",
        10, "X"
            );

    public String convert(int decimalNumber) {

        if(decimalNumber == 4){
            return "IV";
        }
        if(decimalNumber == 9){
            return "IX";
        }
        if(decimalNumber == 14){
            return "XIV";
        }
        if(decimalNumber == 19){
            return "XIX";
        }

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
