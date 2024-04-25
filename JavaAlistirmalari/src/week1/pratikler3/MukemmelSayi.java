package week1.pratikler3;

import java.util.Formattable;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanicidan sayi giris bolumu
        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();
        int total = 0;

        //Sayinin bolenlerinin hesaplanmasi
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        //Mukemmel sayi olup olmadıgının tespiti
        if (total == number) {
            System.out.println(number + " Mukemmel sayidir.");
        } else {
            System.out.println(number + " Mukemmel sayi degildir.");
        }
    }
}
