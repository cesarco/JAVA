package com.example.challenge;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guesing Show Game");
        
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("Do you wanna start the game, yes or no");
        String start = scanner.next();

        switch (start){

            case "yes":
                Random random = new Random();
                int randomNumber = random.nextInt(10);
                System.out.println("what number do you think it is (1 - 10)");

                int number = scanner.nextInt();


                    for (int i= 0; i <= 5; i++) {

                        if (number == randomNumber) {
                            System.out.println("Your answer is correct");
                            break;
                        } else  {
                            System.out.println("Your answer is NOT correct");
                        }

                        System.out.println("Enter a number again: ");
                        number = scanner.nextInt();

                        if (i == 5) {
                            System.out.println("The Game is over");
                        }
                    }

        }


    }
}
