package Tablice1;

public class ZadTab {


    static int arraySum(int[] array) {

        int suma = 0;
        for (int element : array) {
            suma += element;
        }
        System.out.println(suma);
        return suma;
    }

    public static void main(String[] args) {
        int[] number = new int[3];
        int[] number2 = new int[3];


        number[0] = 10;
        number[1] = 20;
        number[2] = 30;


        number2[0] = 7;
        number2[1] = 7;
        number2[2]=7;

        arraySum(number);
        arraySum(number2);
        System.out.println(arraySum(number) + arraySum(number2) + " ");
        // int[] array1 = {10,50,20};

// int sum = number[0] + number[1] + number[2]+number2[0] + number2[1] + number2[2];
    }
}