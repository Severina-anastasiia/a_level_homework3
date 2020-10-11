package com.company;

public class Fibonacci {

    private int[] start = new int[20];

    public Fibonacci(){
        start[0] = 1;
        start[1] = 1;
        init();
    }

    public int phi(int n){
        int temp = 0;
        for(int i = 0; i < start.length; i++){
            if(start[i] == n && i <= start.length-2)
            {
                return start[i+1];
            }
        }
        return temp;
    }

    private void init(){
        for (int i = 2; i < start.length; i++) {
            start[i] = start[i-1] + start[i-2];
        }
    }
}
