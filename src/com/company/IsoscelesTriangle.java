package com.company;

public class IsoscelesTriangle {

    public void iso_triangle(int iso_tnum) {

        for(int i=1; i<=iso_tnum; i++)
        {
            for(int a=iso_tnum; a>i; --a)
            {
                System.out.print(" ");
            }
            for(int j=1; j< (i*2); j++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
