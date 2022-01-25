package com.codurance.academy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    private static Map<Integer, String> decimalToRoman = Map.of(
        50, "L",
        10, "X",
        9, "IX",
        5, "V",
        4, "IV",
        1, "I"
    );

    public String convert(int decimalNumber) {
        StringBuilder output = new StringBuilder();
        var buffer = decimalNumber;

        while(buffer >= 10){
            if (decimalToRoman.containsKey(buffer)) {
                output.append(decimalToRoman.get(buffer));
                buffer -= buffer;
            }
            else {
                output.append(decimalToRoman.get(10));
                buffer -= 10;
            }
        }


        while(buffer >= 5){
            if (decimalToRoman.containsKey(buffer)) {
                output.append(decimalToRoman.get(buffer));
                buffer -= buffer;
            }
            else {
                output.append(decimalToRoman.get(5));
                buffer -= 5;
            }
        }

        if (decimalToRoman.containsKey(buffer)) {
            output.append(decimalToRoman.get(buffer));
            buffer -= buffer;
        }

        for( var i = 0; i< buffer; i++){
            output.append(decimalToRoman.get(1));
        }

        return output.toString();

    }

}
