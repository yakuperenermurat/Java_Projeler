package week1.pratikler2;

import java.util.Scanner;

public class BurcBulanProgram {

    public static void main(String[] args) {

        int day, months;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Ay giriniz : ");
        months = input.nextInt();
        System.out.println("Gün giriniz: ");
        day = input.nextInt();

        // Burada ilk olarak hangi ayı girdiğini tespit ettim
        if (months == 1) {
            // Burada gün aralıklarını dogru girdi mi kontrol ettim.
            if (day >= 1 && day <= 31) {   // Hangi burca aitse ona göre degiskene atadım.
                if (day < 22) {
                    burc = "Oglak";
                } else {
                    burc = "Kova";
                }
            } else {
                // Günü hatalı girerse diye kontrol koydum.
                isError = true;
            }

        } else if (months == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }

        } else if (months == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }

        } else if (months == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 20) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (months == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (months == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (months == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (months == 8) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (months == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (months == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (months == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (months == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            System.out.println("Hatalı bir ay girdiniz!!!");
        }

        if (isError) {
            System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz.");
        } else {
            // Hangi burca ait oldugunun cıktısı.
            System.out.println("Burcunuz : " + burc);
        }
    }

}
