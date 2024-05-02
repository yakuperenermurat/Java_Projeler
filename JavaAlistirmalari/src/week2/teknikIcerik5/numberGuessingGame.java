package week2.teknikIcerik5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        
        while (right < 5) {
            System.out.println("Please enter your prediction : ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100");

                if (isWrong) {
                    right++;
                    System.out.println("You have made too many incorrect entries. your remaining right to try : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("If you enter incorrectly again, your rights will be terminated.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("You win! The number you guessed : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an incorrect number!");
                if (selected > number) {
                    System.out.println("The number " + selected + "is greater than the secret number. ");
                } else {
                    System.out.println("The number " + selected + "is less than the secret number. ");
                }

                wrong[right++] = selected;
                System.out.println("Your remaining rights: " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("You lose!");
            System.out.println("The secret number was: " + number);
            System.out.println("Your wrong predictions: " + Arrays.toString(wrong));
        } else {
            System.out.println("Your predictions: " + Arrays.toString(wrong));
        }
    }
}
