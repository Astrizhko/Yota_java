package com.L4;

/**
 * Created by Strizhko on 19.10.2016.
 */
public class Lesson4_invert {
    public static void invert (int[]arr){
        for (int k = 0; k<arr.length/2;k++) {
            int tmp =arr[k];
            arr[k]=arr[arr.length -k -1];
            arr[arr.length-1-k]=tmp;
        }
    }
}
