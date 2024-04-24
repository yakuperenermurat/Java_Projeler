package week1.pratikler3;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n , k ;
        //Kullanicidan üs ve üssü alinacak sayi degerleri alma bolumu
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        //Uslu sayi hesaplamasi ve ekrana yazdirmasi
        int total = 1 ;
        for(int i = 0 ; i < k ; i++){
            total *= n;
        }
        System.out.println(total);
    }
}
