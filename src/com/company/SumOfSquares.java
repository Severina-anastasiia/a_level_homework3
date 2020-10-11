package com.company;

public class SumOfSquares {

    public int fun(int n){
        int i = 1;
        int temp = 0;
        while (i < n){
            temp += Math.pow(i, 2);
            i++;
        }
        return temp;
    }
}
