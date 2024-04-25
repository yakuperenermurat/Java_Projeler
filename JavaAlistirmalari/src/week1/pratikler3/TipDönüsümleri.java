package week1.pratikler3;

import java.util.Scanner;

public class TipDönüsümleri {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //kullanicidan sayilari alıyoruz
        System.out.println("Bir tam sayı giriniz : ");
        int tamSayi = sc.nextInt();
        System.out.println("Ondalıklı bir sayı giriniz : ");
        double ondalikliSayi = sc.nextDouble();

        //Dönüşüm yapımı ve çiktisi
        System.out.println(tamSayi + " Tam sayısının ondalıklı hale dönüşümü : " + (double) tamSayi);
        System.out.println(ondalikliSayi + " Ondalıklı sayının tam sayı haline dönüşümü : " + (int) ondalikliSayi);
    }
}

