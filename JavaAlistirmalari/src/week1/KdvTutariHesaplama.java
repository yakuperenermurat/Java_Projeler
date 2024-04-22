package week1;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*  System.out.print("Ürün fiyatı: ");
        float fiyat = scanner.nextFloat() ;

        float kdvTutari = 1.8f;
        float kdvliFiyat = (float) (fiyat*0.18) + fiyat;


        System.out.println("Kdcsiz Fiyat: " + fiyat);
        System.out.println("Kdvli Fiyat: " + kdvliFiyat);
        System.out.println("Kdv Tutari: " + kdvTutari);
       */

        // ödev kismi buradan basliyor
        System.out.print("Ürün fiyatı: ");
        float fiyat = scanner.nextFloat() ;

        if(fiyat >0 && fiyat < 1000) {
            float kdvTutari = 1.8f;
            float kdvliFiyat = (float) (fiyat*0.18) + fiyat;

            System.out.println("Kdcsiz Fiyat: " + fiyat);
            System.out.println("Kdvli Fiyat: " + kdvliFiyat);
            System.out.println("Kdv Tutari: " + kdvTutari);
        }else if(fiyat >1000) {

            float kdvTutari = 0.08f;
            float kdvliFiyat = (float) (fiyat*0.08) + fiyat;

            System.out.println("Kdcsiz Fiyat: " + fiyat);
            System.out.println("Kdvli Fiyat: " + kdvliFiyat);
            System.out.println("Kdv Tutari: " + kdvTutari);
        }
    }

}
