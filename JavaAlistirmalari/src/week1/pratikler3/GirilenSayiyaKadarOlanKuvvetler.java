package week1.pratikler3;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanKuvvetler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanicidan sayi girisi yapıldı.
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        //4'un kuvvetleri bulma ve yazdırma
        System.out.println("4'ün kuvvetleri:");
        System.out.println("------------");

        for (int i = 1; i <= number; i*=4) {
            System.out.println( i);
        }

        // 5'in kuvvetlerini bulma ve yazdırma
        System.out.println("5'in kuvvetleri:");
        System.out.println("------------");

        for (int i = 1; i <= number; i*=5) {
            System.out.println( i);
        }
    }
}
