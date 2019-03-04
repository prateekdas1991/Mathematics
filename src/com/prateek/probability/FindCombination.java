package com.prateek.probability;

import com.prateek.plainArithmatic.FindFactorial;

public class FindCombination {

    public static void main(String[] args) {
        System.out.println(new FindCombination().findCombination(66,53));
    }
    public double findCombination(int n, int r){
        FindFactorial fact=new FindFactorial();
        double facA=fact.findFactorial(n);
        double facB=fact.findFactorial(n-r);
        return (facA/facB);
    }
}
