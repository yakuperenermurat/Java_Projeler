package week1;

import java.util.Scanner;

public class AritmetikIslemlerVeIslemOncelikleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Kullanicinin sayilari girdigi bolum
        System.out.print("a sayisini giriniz: ");
        int a = scanner.nextInt();
        System.out.print("b sayisini giriniz: ");
        int b = scanner.nextInt();
        System.out.print("c sayisini giriniz: ");
        int c = scanner.nextInt();

        //Sorulan islemin yapıldigi yer
        int sonuc = a + b * c - b;
        System.out.println("sonuc = " + sonuc);
    }
}
