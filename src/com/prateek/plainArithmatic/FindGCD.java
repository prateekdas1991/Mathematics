package com.prateek.plainArithmatic;

public class FindGCD {

    public static void main(String[] args) {
        int a = 18, b = 12;
        FindGCD findGCM = new FindGCD();

        System.out.println(findGCM.findGcd(a, b));
    }

    /*
    * Modular approach %
    * */
    public int findGcd(int a, int b) {
        if (b == 0) return a;
        else return findGcd(b, a % b);
    }

    public int findGcd1(int a, int b) {
         if(a==0||a==b)return a;
         if(b==0)return b;
         if(a>b)return findGcd1(a-b, b);
         else return findGcd1(a,b-a);
    }
}
