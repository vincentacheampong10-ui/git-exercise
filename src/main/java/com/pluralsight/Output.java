package com.pluralsight;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is you name?:");
        String name = scanner.nextLine();

        System.out.print("What is your age?:");
        int age = scanner.nextInt();

        System.out.println("Hello "+name+ " ,You are "+ age +" years old.");
    }
}
