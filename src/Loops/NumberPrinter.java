package Loops;

import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i: numbers){
            //System.out.println(i);
            i=sc.nextInt();
        }
        for(int i: numbers){
            System.out.println(i);
        }
    }

}
