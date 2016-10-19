package com.L4;

import java.util.Arrays;
//import static com.L4.Lesson4_invert;
/**
 * Created by Strizhko on 19.10.2016.
 */
public class L4_main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        Lesson4_invert.invert(a);
        System.out.println(Arrays.toString(a));

    }
}
