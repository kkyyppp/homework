package com.homework3;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float length=0, width=0, height=0;
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        while (true) {
            System.out.print("Please enter object's length: ");
            length = scanner.nextFloat();
            System.out.print("Please enter object's width: ");
            width = scanner.nextFloat();
            System.out.print("Please enter object's height: ");
            height = scanner.nextFloat();

            if (box3.validate(length, width, height))
                System.out.println("You could use {BOX_3}\n");
            else if (box5.validate(length, width, height))
                System.out.println("You could use {BOX_5}\n");
            else
                System.out.println("There is no suitable box for your object\n");
        }
    }
}
