package com.prateek.plainArithmatic;

import java.util.ArrayList;

public class FindPrimes {
    public static void main(String[] args) {
        System.out.println(findPrime(30));
    }
    public static ArrayList<Long> findPrime(long n){
        ArrayList<Long> resultList=new ArrayList<>();
        for(long i=2;i<=n;i++) {
            boolean isPrime = true;
            for (long j = i - 1; j > 1; j--) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) resultList.add(i);
        }
        return resultList;
    }
}
