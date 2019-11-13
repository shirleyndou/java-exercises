package com.company;

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
    }


}
