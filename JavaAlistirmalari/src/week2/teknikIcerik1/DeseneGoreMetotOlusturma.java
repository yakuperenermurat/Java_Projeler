package week2.teknikIcerik1;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {


    public static void nSayisinaGoreRecursive(int n) {
        // Eğer sayı 0 veya negatifse işlemi sonlandır
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

            
            System.out.print(n + " ");
            nSayisinaGoreRecursive(n - 5);
            System.out.print(n + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N değerini giriniz : ");
        int n = sc.nextInt();
        nSayisinaGoreRecursive(n);

    }
}