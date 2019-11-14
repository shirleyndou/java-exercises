package com.company;

public class Framed_Text {

    public static void frame(String[] words)
    {
        String text = words[0];

        for(int i =0; i<text.length(); i++)
        {
            System.out.println("*" + text + 4);
        }
    }
}

