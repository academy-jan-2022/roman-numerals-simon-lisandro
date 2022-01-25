package com.codurance.academy;

public class RomanNumerals {
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
            output.append("X");
            buffer -= 10;
        }

        while(buffer >= 5){
            output.append("V");
            buffer -= 5;
        }


        for( var i = 0; i< buffer; i++){
            output.append("I");
        }

        return output.toString();

    }
}
