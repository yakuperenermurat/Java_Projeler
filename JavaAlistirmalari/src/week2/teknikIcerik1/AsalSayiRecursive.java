package week2.teknikIcerik1;

import java.util.Scanner;

public class AsalSayiRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if(isPrime(number)) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }

        scanner.close();
    }
    // Rekürsif olarak asal sayı kontrolü yapan fonksiyon
    public static boolean isPrime(int number) {
        // Eğer sayı 2 veya daha küçükse, asal değildir.
        if (number <= 1) {
            return false;
        }
        // Eğer sayı 2 ise, asaldır.
        else if (number == 2) {
            return true;
        }
        // Sayının herhangi bir böleni varsa, asal değildir.
        else {
            return isPrime(number, 2);
        }
    }

    // Yardımcı rekürsif fonksiyon
    private static boolean isPrime(int number, int divisor) {
        // Eğer bölen sayıya eşitse, asaldır.
        if (divisor == number) {
            return true;
        }
        // Eğer bölen sayıya bölünebiliyorsa, asal değildir.
        else if (number % divisor == 0) {
            return false;
        }
        // Rekürsif olarak bir sonraki böleni kontrol et.
        else {
            return isPrime(number, divisor + 1);
        }
    }
}
