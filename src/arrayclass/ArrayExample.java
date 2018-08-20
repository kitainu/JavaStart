package arrayclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  ArrayExample {
    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        System.out.println("Names");
        printArray(names);

        //sortowanie
        System.out.println("Numbers");
       Arrays.sort(numbers);
        printArray(numbers);

        System.out.println("Arrays.sort(numbers): ");
        printArray(numbers);
        System.out.println();
    }

//    public  static <T> void printArray(T[] arr){
//        for(T t: arr ){
//            System.out.println( t+ " ");
//        }
//        System.out.println();
    // }

    //
    public static <T> void printArray(T[] arr) {

    for(T t:arr)

    {
        System.out.println(t);

    }
        System.out.println();


}
}
