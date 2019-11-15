package com.company;

import java.util.Arrays;

public class Combine_Arrays {

    public static void combine(int[] first_array, int[] second_array, int[] combine_arrays)
    {
        //int first_array[] = {11,22,33};
        //int second_array[] = {1,2,3};
        //int [] combine_arrays = new int[first_array.length + second_array.length];
        int j = 0, k =0, f = 0;

        for (int i = 0; i < combine_arrays.length; i++) {
            if (j < first_array.length)
                combine_arrays[f++] = first_array[j++];
            if (k < second_array.length)
                combine_arrays[f++] = second_array[k++];
        }
        System.out.println(Arrays.toString(combine_arrays));
    }
}
