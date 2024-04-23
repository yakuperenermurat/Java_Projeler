package week1;

import java.util.Scanner;

public class VücutKitleEndeksi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy , kilo , vucutKitleEndeksi ;

        // Boyunuzu girerken nokta kullanmanız gerekecekse onun yerine
        // virgül kullanmalısınız.
        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        // Kilonuzu girerken nokta kullanmanız gerekecekse onun yerine
        // virgül kullanmalısınız.
        System.out.print("Kilo giriniz: ");
        kilo = input.nextDouble();

        vucutKitleEndeksi = (kilo / (boy * boy));
        System.out.println("Vücut Kitle Endeksi: " + vucutKitleEndeksi);

    }
}
