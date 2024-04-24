package week1.pratikler3;

import java.util.Scanner;

public class GirilenSayiyaKadarBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Degiskenleri tanimliyoruz.
        int inputNumber ;
        double avarage ;
        int sum = 0 ;
        int counter = 0 ;
        // Kullanicidan sayi girmesini sagliyoruz.
        System.out.print("Sayi giriniz : ");
        inputNumber = input.nextInt();

        // 0 ' dan girilen sayiya kadar tarayıp oradaki 3 ve 4 ' e tam bolunen sayilari bulup toplamasini yapiyoruz.
        for (int i = 0; i <= inputNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }
        }
        // 3 e ve 4' e bolunenlerin ortalama hesabi ve ekrana çiktisi
        avarage = sum / counter;
        System.out.println("Avarage : " + avarage);
    }
}
