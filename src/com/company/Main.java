package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("The computer has chosen a number from 0-50.");
        System.out.println("You have ten attempts to guess the number!");

        int guessAmount = 0;
        while(guessAmount < 10) {
            Scanner input = new Scanner (System.in);
            System.out.println("Take a guess: ");
            int numGuess = input.nextInt();
            int numGoal = random.nextInt(51);

            if(numGuess > numGoal){
                System.out.println("Too high!");
            }

            if(numGuess < numGoal){
                System.out.println("Too low!");
            }

            if(numGuess == numGoal){
                System.out.println("Correct, well done!");
                System.out.println("It took you "+guessAmount+" tries!");
                break;
            }

            else{
                System.out.println("Incorrect, please try again!");
            }

            guessAmount++;

        }

        if (guessAmount > 9){
            System.out.println("Sorry! You lose.");
        }

    }
}
