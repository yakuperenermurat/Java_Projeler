package week2.teknikIcerik4;

import java.util.Arrays;

public class practiceInSerials {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};

        // Dizinin elemanlarını sırala
        Arrays.sort(array);

        // Elemanların frekanslarını tutacak bir dizi oluştur
        int[] frequency = new int[array.length];

        // Dizideki her bir elemanın frekansını bul
        int index = 0;
        while (index < array.length) {
            int count = 1; // Elemanın kendisi
            while (index + count < array.length && array[index] == array[index + count]) {
                count++; // Aynı elemandan bir tane daha bulduk
            }
            frequency[index] = count; // Elemanın frekansını kaydet
            index += count; // Sonraki farklı elemana geç
        }

        // Sonuçları yazdır
        for (int i = 0; i < array.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(array[i]+ " Elemanı "  + " " + frequency[i] + " kez tekrar edildi.");
            }
        }
    }
}
