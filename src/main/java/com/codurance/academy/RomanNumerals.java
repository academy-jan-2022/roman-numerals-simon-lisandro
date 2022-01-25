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
        19, "XIX",
        50, "L"

    );

    public String convert(int decimalNumber) {


        StringBuilder output = new StringBuilder();
        var buffer = decimalNumber;

        if (decimalToRoman.containsKey(buffer)) {
            output.append(decimalToRoman.get(buffer));
            buffer -= buffer;
        }
        while(buffer >= 10){
            output.append(decimalToRoman.get(10));
            buffer -= 10;
        }

        if (decimalToRoman.containsKey(buffer)) {
            output.append(decimalToRoman.get(buffer));
            buffer -= buffer;
        }

        while(buffer >= 5){
            output.append(decimalToRoman.get(5));
            buffer -= 5;
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
