package week1;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        double kmFiyati = 2.20;
        int taksimetreAcilisÜcreti = 10 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        int gidilenKm = scanner.nextInt();

        double ToplamÜcret = 10 + (kmFiyati * gidilenKm);

        // taksimetrenin 20 tl altı olup olamama durumuna
        // göre fiyat belirlenmesi yapıldı.
        if(ToplamÜcret < 20 ){

            ToplamÜcret = 20 ;

            System.out.println("Toplam ücret = " + ToplamÜcret );
        }else {

            System.out.println("Toplam ücret = " + ToplamÜcret);

        }
    }
}
