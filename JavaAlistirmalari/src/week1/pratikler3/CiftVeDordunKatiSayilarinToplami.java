package week1.pratikler3;

import java.util.Scanner;

public class CiftVeDordunKatiSayilarinToplami {

    public static void main(String[] args) {
        int inputNumber;
        int total = 0;

        Scanner input = new Scanner(System.in);

        //Surekli deger girilmesi icin donguye aldım.
        while (true) {
            System.out.println("Bir sayı giriniz veya programı sonlandırmak için tek sayı girin: ");
            inputNumber = input.nextInt();
            // Cift ve 4 ' e bolunenlerin kontrolu
            if (inputNumber % 2 == 0 && inputNumber % 4 == 0) {
                total += inputNumber;
            }
            if (inputNumber % 2 != 0) {
                break; // Tek sayı girilirse döngüden çıkmak icin break komutu kullanildi.
            }
        }
        System.out.println("Toplam: " + total);
    }
}