package String.zad;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println(" Input number of words : ");
        int  number = scan.nextInt();
        scan.nextLine();

        String[] words = new String[number];
        for(int i =0; i<number; i++){
            words[i]= scan.nextLine();
        }
    }



}
