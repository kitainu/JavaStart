package statyczne;

import java.util.Scanner;

public class PrintNumbers {
   // public static final int EXIT = 0;

//    public static void printNumber(int start, int end){
//        for(int i=start; i<=end; i++){
//            System.out.println(i + " ");
//        }
//        System.out.println();
//    }
    public static void printNumber(int start, int end){
        for(int i = start; i<=end; i++ ){
            System.out.println(i);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int start = input.nextInt();
        System.out.println("Podaj liczbę: "+ start);
        int end = input.nextInt();
        System.out.println("Podaj liczbę: "+ end);
    }
}
