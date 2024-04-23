package week1;

import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {

        double r , a , dilimAlani , pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = input.nextDouble();

        dilimAlani = (pi *( r * r) * a) / 360;

        System.out.println("Daire diliminin alani : " + dilimAlani);
    }
}
