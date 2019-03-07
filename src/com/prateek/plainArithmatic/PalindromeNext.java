package com.prateek.plainArithmatic;

import java.math.BigInteger;

public class PalindromeNext {

    public static void main(String[] args) {
        BigInteger input=new BigInteger("12345699654321");
        //System.out.println(input.toString().length());

        int length=input.toString().length();
        //long addition = 0;
        if(length%2==0) {
            input=new BigInteger(input.toString().substring(0,(length/2)));
            input=new BigInteger(Long.toString(input.longValue()+1));
            StringBuilder sb=new StringBuilder(input.toString()).reverse();
            System.out.println(input.toString().concat(
                    (input.toString().endsWith("9")?
                            sb.toString().substring(1,sb.length()):
                            sb.toString())
            ));
        }
        else {
            input = new BigInteger(input.toString().substring(0, (length / 2) + 1));
            input = new BigInteger(Long.toString(input.longValue() + 1));
            StringBuilder sb = new StringBuilder(
                    input.toString().substring(0, input.toString().length() - 1)).reverse();
            System.out.println(
                    input.toString().concat(
                            (input.toString().endsWith("9")?
                                    sb.toString().substring(1,sb.length()):
                                    sb.toString())));
        }
    }
}
