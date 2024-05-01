package week2.teknikIcerik4;

public class arrayListAvarage {
    public static void main(String[] args) {

        int [] numbers = {1,2,3};
        double harmonicSeries = 0 ;
        for(int i= 0 ; i<numbers.length; i++){

            harmonicSeries += (double) 1 / numbers[i];
        }
        System.out.println("Harmonic avarage : " + (numbers.length / harmonicSeries ) );

    }
}
