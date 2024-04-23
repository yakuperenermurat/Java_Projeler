package week1;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {

        double armut , elma , domates , muz , patlican ,
                armutKgFiyati = 2.14 , elmaKgFiyati = 3.67 , domatesKgFiyati = 1.11,
                muzKgFiyati = 0.95, patlicanKgFiyati = 5.00 , toplamTutar ;

        // Kullanicidan ürünlerin kac kg aldiklarini alıp degiskenlere atadim.

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        armut = input.nextDouble();

        System.out.print("Elma Kaç Kilo : ");
        elma = input.nextDouble();

        System.out.print("Domates Kaç Kilo : ");
        domates = input.nextDouble();

        System.out.print("Muz Kaç Kilo : ");
        muz = input.nextDouble();

        System.out.print("Patlican Kaç Kilo : ");
        patlican = input.nextDouble();

        // Toplam tutatrı birim fiyat * kullanicidan girilen fiyat ile buldum.
        toplamTutar = ( armut * armutKgFiyati) + ( elma * elmaKgFiyati )
                        + ( domates * domatesKgFiyati) + ( muz * muzKgFiyati)
                        + ( patlican * patlicanKgFiyati);
        
        System.out.println("Toplam Tutar : "+toplamTutar);
    }

}
