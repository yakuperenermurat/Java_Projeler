package week2.teknikIcerik4;

import java.util.Scanner;

public class arrayListMaxMin {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value :  ");
        int value = input.nextInt();
        int nearestLess = Integer.MIN_VALUE;
        int nearestGreater = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < value && i > nearestLess) {
                nearestLess = i;
            }
            if (i > value && i < nearestGreater) {
                nearestGreater = i;
            }
        }

        System.out.println("Nearest number less than the entered number : " + nearestLess );
        System.out.println("Nearest number greater than the entered number : " + nearestGreater);

    }
}
