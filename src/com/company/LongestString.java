package com.company;

public class LongestString {

    public static void longest_string(String[] longest)
    {
        String longestString = longest[0];
        for(int i=1; i<longest.length; i++)
        {
            if(longest[i].length()> longestString.length())
            {
                longestString = longest[i];
            }
        }

        for(int j=0; j<longest.length; j++)
        {
            if(longest[j].length()== longestString.length())
            {
                System.out.println(longest[j]);
            }
        }
    }
}
