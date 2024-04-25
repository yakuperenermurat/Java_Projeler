package week1.pratikler3;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;
        while (right > 0) {
            //Kullanıcı bilgileri giris bolumu
            System.out.print("Kullanıcı Adını giriniz: ");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("Yakup123") && password.equals("Eren123")) {
                System.out.println("Merhaba bankamatiğe hoşgeldinizç. ");
                System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                do {
                    //Atm islemleri kismi
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı :");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz. ");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                            System.out.println("Lütfen seçeneklerdeki işlemleri seçiniz. ");
                            break;
                    }
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. ");
                break;
            } else {
                // Hatali kullanici adi ve sifre girerse 
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }
                System.out.println("Kalan hakkınız : ");
            }
        }


    }
}
