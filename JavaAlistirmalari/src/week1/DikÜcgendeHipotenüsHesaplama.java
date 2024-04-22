package week1;

import java.util.Scanner;

public class DikÜcgendeHipotenüsHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin birinci dik kenarını giriniz: ");
        int kenar1 = input.nextInt();
        System.out.print("Üçgenin ikinci dik kenarını giriniz: ");
        int kenar2 = input.nextInt();

        //Hipotenüs bulma
        double hipotenüs= Math.sqrt ((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs: " + hipotenüs);

        //Üçgenin alanı
        double ucgenAlan = (kenar1 * kenar2 ) /2;
        System.out.println("Üçgenin Alanı: " + ucgenAlan);


    }
}
