package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        hello hello_name = new hello();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        hello_name.hello(name);

        EvenOdd even_odd = new EvenOdd();
        System.out.println("Enter a number");
        int number = scan.nextInt();
        even_odd.even_or_odd(number);

        Square square = new Square();
        System.out.println("Enter square number");
        int snum = scan.nextInt();
        square.draw_a_square(snum);

        Triangle triangle = new Triangle();
        System.out.println("Enter triangle number");
        int tnum =  scan.nextInt();
        triangle.triangle(tnum);

        IsoscelesTriangle iso_trianle = new IsoscelesTriangle();
        System.out.println("Enter iso triangle number");
        int iso_tnum = scan.nextInt();
        iso_trianle.iso_triangle(iso_tnum);

        //LongestString obj6 = new LongestString();
        String[] longest = {"the","quick","brown", "fox", "ate", "my", "chickens", "knuckles"};
        LongestString.longest_string(longest);


        int first_array[] = {11,22,33};
        int second_array[] = {1,2,3};
        int [] combine_arrays = new int[first_array.length + second_array.length];
        //System.out.println(Arrays.toString(combine_arrays));
        Combine_Arrays.combine(first_array, second_array, combine_arrays);



        String[] words = {"Write","good","code","every","day"};
       // System.out.println("Enter a couple of words");
        //String text = scan.nextLine();
        Framed_Text.frame(words);

    }


}
