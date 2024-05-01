package week2;

import java.util.Arrays;


public class denem {

        public static void main(String[] args)
        {

            int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

            Arrays.fill(liste, 2);
            System.out.println(Arrays.toString(liste));

            int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

            Arrays.fill(liste2, 3, 5, 7);
            System.out.println(Arrays.toString(liste2));
                }
            }



