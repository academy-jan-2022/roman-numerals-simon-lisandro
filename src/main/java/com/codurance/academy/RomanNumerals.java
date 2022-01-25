package com.codurance.academy;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {
    private static final SortedMap<Integer, String> decimalToRoman =
        new TreeMap<>(Map.of(
            50, "L",
            49, "IL",
            45, "VL",
            40, "XL",
            10, "X",
            9, "IX",
            5, "V",
            4, "IV",
            1, "I"
        )).descendingMap();

    public String convert(int decimalNumber) {
        StringBuilder output = new StringBuilder();
        var buffer = decimalNumber;

        for (var key : decimalToRoman.keySet()) {
            while(buffer >= key){
                output.append(decimalToRoman.get(key));
                buffer -= key;
            }
        }

        return output.toString();
    }
}
