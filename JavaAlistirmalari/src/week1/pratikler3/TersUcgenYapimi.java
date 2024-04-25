package week1.pratikler3;

import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kullanicidan basamak sayisi girme bolumu
        System.out.print("Basamak sayısını : ");
        int basamakSayisi = input.nextInt();

        // Ters ucgen olusturma
        for (int i = 0; i < basamakSayisi; i++) {
            for (int j = (basamakSayisi - i); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
