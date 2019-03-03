package com.prateek.plainArithmatic;

public class FindGCD {

    public static void main(String[] args) {
        int a=3,b=24;
        FindGCD findGCM=new FindGCD();

        System.out.println(findGCM.findGcd(a,b));
    }

    public int findGcd(int a, int b){
        if(a==0||a==b) return a;
        if(b==0) return b;
        if(a>b) return findGcd(a-b,b);
        else return findGcd(a,b-a);
    }
}
