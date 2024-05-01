package week2.teknikIcerik4;

import java.util.Arrays;
import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(( i + 1 ) + " .element : " );
            int num = sc.nextInt();
            arr[i] = num;
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
