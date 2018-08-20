package Loops;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            if (numb % 2==0){
                System.out.println("liczba jest parzysta ");
            }else
                System.out.println("liczba jest nieparzysta");


        }
    }
}
