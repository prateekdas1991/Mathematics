package com.prateek.plainArithmatic;

public class FindLCM {
    public static void main(String[] args) {
        int a=3,b=5;
        System.out.println(new FindLCM().findLcm(a,b));
    }
    public int findLcm(int a, int b){
        int gcd=new FindGCD().findGcd(a,b);
        return ((a*b)/gcd);
    }
}
