package com.company;

public class Framed_Text {

    public static void frame(String[] words)
    {

        //String[] words = {"Write","good","code","every","day"};

        String text_array = words[0];
        for(int i =0; i<=words.length + 2; i++)
        {
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();

        for(int j=0; j<words.length; j++)
        {
            /*if(words[j].length()<= text_array.length())
            {
                System.out.println("* " + words[j] + "\t*");
            }*/
            System.out.println("* " + words[j] + "\t*");
        }
        //System.out.print("*");
        //System.out.println();

        for(int i =0; i<=words.length + 1; i++)
        {
            System.out.print("*");
        }
        System.out.print("*");

    }
}

