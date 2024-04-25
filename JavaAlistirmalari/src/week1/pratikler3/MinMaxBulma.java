package week1.pratikler3;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanici kac adet sayı girmesi gerektigi bolum
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int adetSayisi = input.nextInt();
        int minValue = 0, maxValue = 0;

        // Kullanicinin sayilari girdigi bolum
        for (int i = 0; i < adetSayisi; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz : ");
            int girilenSayi = input.nextInt();
            // if else ile en buyuk ve en kucuk deger buldugum yer
            if (girilenSayi <= minValue) {
                minValue = girilenSayi;
            } else {
                maxValue = girilenSayi;
            }
        }
        //En buyuk sayı ve en kucuk sayıyı yazdırma alanı
        System.out.println("En büyük sayı : " + maxValue);
        System.out.println("En küçük sayı : " + minValue);
    }
}
