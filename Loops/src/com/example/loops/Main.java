package com.example.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Cesar");
        }*/

        int a = 5;
        /*
        while (a < 10) {
            System.out.println("Cesar");
            // break
            a++;
        }

         *//*
        while (a<10){
             a++;

             if (a == 8) {
                 continue;
             }
            System.out.println("Hello");
        }*/
/*
        do {
            System.out.println("Hello");
        } while (a < 5);
        */
        /*
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        System.out.println("answer was: " + answer);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

         */

        Random ramdom = new Random();
        int number = ramdom.nextInt(20);
        System.out.println(number);
    }
}
