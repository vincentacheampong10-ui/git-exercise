package com.pluralsight;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.print("What is you name?:");
            String name = scanner.nextLine();

            System.out.print("What is your age?:");
            int age = scanner.nextInt();

            System.out.println("Hello " + name + " ,You are " + age + " years old.");
           run = false;
           scanner.close();
        }
    }
public void calculator (Scanner scanner) {
boolean calculate = true;

    while (calculate) {
        System.out.println(""" 
               1) Add
               2) Multiply
               3) Divide
               4) Subtract
          chose and option:
                """);

        System.out.println("New changes for second branch");
    }
    }
}
