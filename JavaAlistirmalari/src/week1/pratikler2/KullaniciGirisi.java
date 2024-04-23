package week1.pratikler2;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String username, password;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan kullanıcı adı ve şifre girişi isteme
        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        //Girilen şifre doğruysa
        if (username.equals("Yakup") && password.equals("Yakup123")) {
            System.out.println("Giriş Yaptınız : ");

            //Girilen şifre yanlışsa
        } else {
            System.out.println("Bilgileriniz yanlış:");

            // Kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sor
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? (Evet/Hayır) : ");
            String cevap = input.nextLine();

            // Eğer kullanıcı şifresini sıfırlamak isterse
            if (cevap.equals("Evet")) {

                // Yeni şifreyi al
                System.out.println("Yeni şifre giriniz : ");
                String yeniSifre = input.nextLine();

                // Yeni şifre doğru girilmiş ve eski şifreyle farklıysa
                if (yeniSifre.equals("Eren123") && !yeniSifre.equals("Yakup123")) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }
    }
}
