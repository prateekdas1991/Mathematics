package com.prateek.plainArithmatic;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(new FindFactorial().findFactorial(4));
    }

    public double findFactorial(int n){
        if (n<0) throw new ArithmeticException(" Factorial can't be found for negative number");
        else if(n==0||n==1) return 1;
        else return n*findFactorial(n-1);
    }
}
