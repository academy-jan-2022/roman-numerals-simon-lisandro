package com.codurance.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test public void
    resturn_1_when_is_given(){
        var romanNumerals = new RomanNumerals();

        var result = romanNumerals.convert(1);

        assertEquals(result, "I");
    }
}
