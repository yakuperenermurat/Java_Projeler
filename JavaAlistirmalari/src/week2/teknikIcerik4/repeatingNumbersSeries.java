package week2.teknikIcerik4;

public class repeatingNumbersSeries {

    static boolean isFind (int [] arr , int value){
        for (int  i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list = {3 , 6 , 8 , 8 , 3 , 5 , 4 , 4, 4 ,2 , 2, 5 ,6 , 7, 7 };
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(list[i] == list[j] && i != j) {
                    if(!isFind(duplicate , list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if(value != 0){
                if (value % 2 == 0 )
                System.out.println(value);
            }
        }
    }
}
