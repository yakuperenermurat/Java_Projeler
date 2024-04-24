package week1.pratikler3;

import java.util.Scanner;

public class HarmonikSeriBulma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        int n = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
                sum += (1.0/i);
        }
        System.out.println("Sum = " + sum);
    }
}
