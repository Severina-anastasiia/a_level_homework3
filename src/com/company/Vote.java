package com.company;

import java.util.Arrays;

public class Vote {

    public int election(int[] arr){
        int count = 0;
        int l = -1;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    temp++;
                }
                if (temp <= count) {
                    continue;
                }
                count = temp;
                l = i;
            }
        }
        return l;
    }
        
}
