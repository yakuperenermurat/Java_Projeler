package week1;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        //Burada javanin scanner sinifini kullanarak disaridan veri almayi sagladim.
        Scanner scanner = new Scanner(System.in);

        // Burada değiskenleri dısaridan int tipinde deger alinabilmesi sagladim.
        System.out.print("Matematik = " );
        int matematik = scanner.nextInt();
        System.out.print("Fizik = " );
        int fizik = scanner.nextInt();
        System.out.print("Turkce = " );
        int turkce = scanner.nextInt();
        System.out.print("Kimya = " );
        int kimya = scanner.nextInt();
        System.out.print("Tarih = " );
        int tarih = scanner.nextInt();
        System.out.print("Muzik = ");
        int muzik = scanner.nextInt();

        Float ortalama;
        ortalama = (float)( matematik + fizik + turkce + kimya + tarih + muzik ) / 6;
        System.out.println("Ortalama = " + ortalama);


        if (ortalama >= 60) {
            System.out.println("Sınıfı geçti.");
        } else {
            System.out.println("Sınıfta kaldı.");
        }


    }
}