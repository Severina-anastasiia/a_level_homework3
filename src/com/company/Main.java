package com.company;

public class Main {

    public static void main(String[] args) {
        Vote vote = new Vote();
        int[] arr = {0, 1, 1, 0, 3, 4, 0};
        int k = vote.election(arr);
        System.out.println("Vote = " + k);

        Fibonacci fibonacci = new Fibonacci();
        int n = fibonacci.phi(55);
        System.out.println("Fibonacci =" + n);
        
        SumOfSquares sum = new SumOfSquares();
        int m = sum.fun(5);
        System.out.println("Sum = " + m);
    }
}
