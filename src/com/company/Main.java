package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);

        hello obj = new hello();
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        obj.hello(name);

        EvenOdd obj2 = new EvenOdd();
        System.out.println("Enter a number");
        int number = scan.nextInt();
        obj2.even_or_odd(number);

        Square obj3 = new Square();
        System.out.println("Enter square number");
        int snum = scan.nextInt();
        obj3.draw_a_square(snum);

        Triangle obj4 = new Triangle();
        System.out.println("Enter triangle number");
        int tnum =  scan.nextInt();
        obj4.triangle(tnum);

        IsoscelesTriangle obj5 = new IsoscelesTriangle();
        System.out.println("Enter iso triangle number");
        int iso_tnum = scan.nextInt();
        obj5.iso_triangle(iso_tnum);

    }


}
