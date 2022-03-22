package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Guess Me Game!");
        System.out.println("What is your name?");

        //User inputs his name
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //Welcome message
        System.out.println("Hello " + name);

        //Start of the game
        System.out.println("Shall we start?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int startGameAnswer = scanner.nextInt();

        while (startGameAnswer != 1){
            System.out.println("Shall we start?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            startGameAnswer = scanner.nextInt();
        }

        //Computer generates a random number
        Random random = new Random();
        int computerNumber = random.nextInt(20) + 1;

        //User guesses a number
        System.out.println("Please enter a number: ");
        int userNumber = scanner.nextInt();

        int count = 0;
        boolean hasWon = false;
        boolean gameShouldFinish = false;

        while(!gameShouldFinish) {
            count++;

            if (count < 5){
                if (userNumber == computerNumber){
                    hasWon = true;
                    gameShouldFinish = true;
                } else if (userNumber > computerNumber){
                    System.out.println("Your number is higher. Guess lower!");
                    userNumber = scanner.nextInt();
                }  else {
                    System.out.println("Your number is lower. Guess higher!");
                    userNumber = scanner.nextInt();
                }
            }else {
                gameShouldFinish = true;
            }
        }

        if (hasWon){
            System.out.println("Congrats for the win! You have guessed in your " + count + " guess");
        } else {
            System.out.println("Game over!");
            System.out.println("The correct number was: " + computerNumber);
        }


    }
}
