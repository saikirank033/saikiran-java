package com.week2.src;

import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        int x = 100;
        for (int i = 0; i < num; i++) {
            x=i;
            if (x % 3 == 0) {
                if (x % 5 == 0) {
                    System.out.println(i+" fizzbuzz");
                } else {
                    System.out.println(i+" fizz");
                }
            } else if (x % 5 == 0) {
                System.out.println(i+" buzz");
            }

        }

    }
}
