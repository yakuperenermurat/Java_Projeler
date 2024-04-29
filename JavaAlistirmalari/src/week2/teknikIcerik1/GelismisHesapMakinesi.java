package week2.teknikIcerik1;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    // Toplama işlemi
    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + "sayı: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result = result + number;
        }
        System.out.println("Sonuç : " + result);
    }
    // Çikarma islemi
    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz : ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    //carpma islemi
    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.println(i++ + ". sayı :");
            number = input.nextInt();
            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    //bölme islemi
    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    //üslü sayi islemi
    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    //faktoriyel islemi
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    // mod alma islemi
   static void modAlma() {
        Scanner input = new Scanner(System.in);
       System.out.print("Mod alınacak sayıyı giriniz :");
       int n = input.nextInt();
       System.out.println("Kaça göre modu alınacak giriniz :");
       int mod = input.nextInt();
       System.out.println((n % mod));

    }
    //dikdorgen alan ve cevre hesabı
    static void DikdortgenAlanVeCevresi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz : ");
        int kisaKenar = input.nextInt();
        System.out.println("Uzun kenarı giriniz : ");
        int uzunKenar = input.nextInt();
        System.out.println("Dikdörgenin alanı : " + (uzunKenar * kisaKenar));
        System.out.println("Dikdörtgenin çevresi : " + ((kisaKenar + uzunKenar) * 2));
    }
    //hesap makinesinin ekran ciktisi
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    DikdortgenAlanVeCevresi();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }


}
