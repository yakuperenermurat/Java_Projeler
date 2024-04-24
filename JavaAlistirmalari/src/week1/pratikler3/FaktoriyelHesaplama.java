package week1.pratikler3;

import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nFaktoriyel = 1 , rFaktoriyel = 1  , nEksiRFaktoriel = 1  ;
        double  combination;
        //Kullanicidan deger girişleri bolumu
        System.out.print("N değerini giriniz : ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz : ");
        int r = input.nextInt();

        // Faktoriyelleri ayri ayri hesaplandi.
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }
        for (int i = 1; i <= (n -r); i++) {
            nEksiRFaktoriel *= i;
        }
        //Burada kombinasyon hesabi yapildi.
        combination = nFaktoriyel / (rFaktoriyel * nEksiRFaktoriel);
        System.out.println("C (" + n +"," + r + ")"+ " = " + combination );

    }
}
