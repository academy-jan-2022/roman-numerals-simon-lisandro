package com.codurance.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test public void
    return_I_when_1_is_given(){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(1);

        assertEquals(result, "I");
    }

    @Test public void
    return_II_when_2_is_given(){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(2);

        assertEquals(result, "II");
    }

    @Test public void
    return_III_when_3_is_given(){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(3);

        assertEquals(result, "III");
    }

    @Test public void
    return_V_when_5_is_given(){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(5);

        assertEquals(result, "V");
    }
}
