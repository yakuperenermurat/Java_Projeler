package week1.pratikler2;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz : ");
        int yil = input.nextInt();

        // 4'ün kati olup ve 100 e bölünmezde veya 100 ' e tam bolunuyorsa 400 e kalansiz bolundugunde bu sart calistirdim.
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }


    }
}
