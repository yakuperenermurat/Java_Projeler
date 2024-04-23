package week1.pratikler2;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        double sayi1 , sayi2 ;
        int yapilacakIslem;

        Scanner input = new Scanner(System.in);

        // Kullanicidan sayi girişleri bölümü
        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextDouble();

        // yapilacak islem secimi
        System.out.println("1-Toplama\n2-Çıkarman\n3-Çarpma\n4-Bölme");

        System.out.println("Seçiminiz : ");
        yapilacakIslem = input.nextInt();

        // if else yerine switch-case ile secim yapılış bölümü
        switch (yapilacakIslem) {
            case 1:
                System.out.println("Toplam : " +(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarman : " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma : " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme : " + (sayi1%sayi2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz. ");
        }
    }
}
