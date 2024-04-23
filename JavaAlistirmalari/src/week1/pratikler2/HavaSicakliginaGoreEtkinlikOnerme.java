package week1.pratikler2;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Hava sıcaklığının kullanicidan girisi
        System.out.print("Hava sıcaklığı giriniz : ");
        double havasicakligi = scanner.nextDouble();

        // Sıcaklıkların hangi aralıkta olduğunun kontrolü ve duruma göre ciktsi
        if (havasicakligi < 5) {
            System.out.println("Kayak için güzel bir havasicakligi: " + havasicakligi);
        } else if (havasicakligi >= 5 && havasicakligi < 15) {
            System.out.println("Sinema için güzel bir havasicakligi: " + havasicakligi);
        } else if (havasicakligi >= 15 && havasicakligi < 25) {
            System.out.println("Piknik için güzel bir havasicakligi: " + havasicakligi);
        } else {
            System.out.println("Yüzme için güzel bir havasicakligi: " + havasicakligi);
        }
    }
}
