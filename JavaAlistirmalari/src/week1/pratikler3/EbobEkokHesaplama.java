package week1.pratikler3;

import java.util.Scanner;

public class EbobEkokHesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number1: ");
        int number1 = input.nextInt();
        System.out.print("Number2 ");
        int number2 = input.nextInt();
        int ebob = 1;

        //Ebob bulan bolum
        int j = number1;
        while (j >= 1) {
            if (number1 % j == 0 && number2 % j == 0) {
                ebob = j;
                System.out.println(ebob);
                break;
            }
            j--;
        }
        //Ekok bulan bolum
        int i = 1;
        while (i < number1 * number2) {
            if (i % number1 == 0 && i % number2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}
