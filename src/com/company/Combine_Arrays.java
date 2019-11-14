package com.company;

public class Combine_Arrays {

    public static void combine(int arry[][])
    {
        for(int i=0; i<arry.length; i++)
        {
            for(int j=0; j<arry[i].length; j++)
            {
                System.out.print(arry[i][j] + ",");
            }
            //System.out.println();
        }
    }
}
