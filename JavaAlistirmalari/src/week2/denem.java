package week2;

import java.util.Arrays;
import java.util.Scanner;


public class denem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu al
        int n = scanner.nextInt();

        // Diziyi al
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Negatif toplamlı alt dizilerin sayısını hesapla
        int count = countNegativeSubarrays(array);
        System.out.println(count);

        scanner.close();
    }

    // Negatif toplamlı alt dizilerin sayısını hesaplayan fonksiyon
    public static int countNegativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
            }



