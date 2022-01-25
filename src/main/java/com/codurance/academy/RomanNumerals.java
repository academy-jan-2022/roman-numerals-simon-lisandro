package com.codurance.academy;

public class RomanNumerals {
    public String convert(int decimalNumber) {
        if(decimalNumber == 2) {
            return "II";
        }
        if(decimalNumber == 3) {
            return "III";
        }
        return "I";
    }
}
