package week5;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        //defining the array
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Getting index from user
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir index girin: ");
        int indeks = input.nextInt();

        //Call the method and print the result
        try {
            int eleman = indeksiDondur(array, indeks);
            System.out.println("Seçilen indeksteki eleman : " + eleman);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata : Belirtilen index dizi boyutunun dışında! ");
        }
    }



    public static int indeksiDondur(int [] array , int indeks) throws ArrayIndexOutOfBoundsException{
        //Return the element of the specified index
        return array [indeks];
    }
}
