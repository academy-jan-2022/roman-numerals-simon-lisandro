package com.codurance.academy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX",
        "10, X",
        "13, XIII",
        "14, XIV",
        "15, XV"
    })
    public  void return_roman_number_when_decimal_is_given(int decimalNumber, String expected){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(decimalNumber);

        assertEquals(expected, result);
    }
}
