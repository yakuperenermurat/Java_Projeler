package week2.teknikIcerik1;

import java.util.Scanner;

public class UsAlmaRecursive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        double tabanDegeri = sc.nextInt();
        System.out.println("Üs değeri giriniz : ");
        double usDegeriGiriniz = sc.nextInt();
        double result = power(tabanDegeri, usDegeriGiriniz);

        // Sonucu yazdır
        System.out.println(tabanDegeri + " üzeri " + usDegeriGiriniz + " = " + result);
    }
    // Recursive üs alma fonksiyonu
    public static double power(double base, double exponent) {
        // Eğer üs 0 ise sonuç 1'dir.
        if (exponent == 0) {
            return 1;
        }
        // Eğer üs negatif ise, pozitif yap ve tabanı ters çevir.
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        // Recursive hesaplama
        else {
            return  (base * power(base, exponent - 1));
        }
    }
}

