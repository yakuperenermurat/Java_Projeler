package week1.pratikler2;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {

        //Burada burc diye bir degiskene atama yaptım.Tek tek yazdırmak yerine.
        String burc = "";
        
        Scanner input = new Scanner(System.in);

        //Dogum yili girisi
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        // Burada girilen yılın hangi aya denk geldigi ayarlandı.
        if (dogumYili % 12 == 0) {
            burc = "Maymun";
        } else if (dogumYili % 12 == 1) {
            burc = "Horoz";
        } else if (dogumYili % 12 == 2) {
            burc = "Köpek";
        } else if (dogumYili % 12 == 3) {
            burc = "Domuz";
        } else if (dogumYili % 12 == 4) {
            burc = "Fare";
        } else if (dogumYili % 12 == 5) {
            burc = "Öküz";
        } else if (dogumYili % 12 == 6) {
            burc = "Kaplan";
        } else if (dogumYili % 12 == 7) {
            burc = "Tavşan";
        } else if (dogumYili % 12 == 8) {
            burc = " Ejderha";
        } else if (dogumYili % 12 == 9) {
            burc = "Yılan";
        } else if (dogumYili % 12 == 10) {
            burc = "At";
        } else if (dogumYili % 12 == 11) {
            burc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}

