package week1.pratikler2;

import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        // Notların girişi bu bölümde saglandi.
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        // Notların 100 ile 0 arasında girilenlerini ortalamaya katma bölümü
        int toplamNot = 0;
        int dersSayisi = 0;

        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            dersSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            dersSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            dersSayisi++;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            dersSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }
        //Ortalama hesaplaması
        double ortalama = (double) toplamNot / dersSayisi;

        // 55 ve üstü olma şartı ile ortalamanın kontrolü
        if (dersSayisi > 0 && ortalama >= 55) {
            System.out.println("Sınıfı Geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
