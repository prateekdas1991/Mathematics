package com.prateek.probability;

import com.prateek.plainArithmatic.FindFactorial;

public class FindPermutation {

    public static void main(String[] args) {
        System.out.println(new FindPermutation().findPermutation(4,2));
    }
    public double findPermutation(int n,int r){
        FindFactorial fact=new FindFactorial();
        return (fact.findFactorial(n)/(fact.findFactorial(r)*fact.findFactorial(n-r)));
    }
}
