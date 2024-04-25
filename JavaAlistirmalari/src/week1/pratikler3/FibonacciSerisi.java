package week1.pratikler3;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Kullanicidan kac elemanlı dizi girecegi alan
        System.out.println("Kaç elemanlı fibonacci serisi: ");
        int n = sc.nextInt();
        int fibonacci = 0;

        //Fibonacci serisinin hesaplanmasi ve çiktisi
        System.out.println("Fibonacci serisi:");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
