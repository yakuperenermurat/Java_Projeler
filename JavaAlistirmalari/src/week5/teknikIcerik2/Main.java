package week5.teknikIcerik2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Savaş ve Barış", 1225, "Lev Tolstoy", "1869-1870");
        Book book2 = new Book("Suç ve Ceza", 544, "Dostoyevski", "1866");
        Book book3 = new Book("İnce Memed", 272, "Yaşar Kemal", "1955");
        Book book4 = new Book("Kürk Mantolu Madonna", 320, "Sabahattin Ali", "1943");
        Book book5 = new Book("Nutuk", 766, "Mustafa Kemal Atatürk", "1927");

        // Set that sorts books by name
        Set<Book> bookSetByName = new TreeSet<>(Comparator.comparing(Book::getTitle));
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("Kitaplar isme göre sıralı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Set that sorts books by page number
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
