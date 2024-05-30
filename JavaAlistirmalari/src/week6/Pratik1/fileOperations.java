package week6.Pratik1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileOperations {
    public static void main(String[] args) {
        try {
            //Read text from file and print to screen
            FileReader fileReader = new FileReader("/Users/yakuperenermurat/Documents/GitHub/Java_Projeler/JavaAlistirmalari/src/week6/Pratik1/Patika.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            int total = 0;
            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                total += number;
            }
            bufferedReader.close();
            System.out.println("Sum of numbers :" + total);

        } catch (IOException e) {
            System.err.println("File read error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}
