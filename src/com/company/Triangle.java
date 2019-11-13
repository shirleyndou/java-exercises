package com.company;

public class Triangle {

    public void triangle(int tnum){
        for(int i=1; i<=tnum; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
