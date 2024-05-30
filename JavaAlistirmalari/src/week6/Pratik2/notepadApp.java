package week6.Pratik2;

import java.io.*;
import java.util.Scanner;

public class notepadApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String metin = scanner.nextLine();
        //File extension
        String filePath = "/Users/yakuperenermurat/Documents/GitHub/Java_Projeler/JavaAlistirmalari/src/week6/Pratik2/Notepad.txt";
        try {
            //Write text to file
            FileWriter  fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(metin);
            printWriter.close();

            //Read text from file and print to screen
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println("Last recorded text: " + line);

        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }

    }
}
