package Loops;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        int numberOfNumbers = inputNumber();// przypisanie metody do  zmiennej powoduje
        //zwrócenie wartości a nie wywołanie metody
        int tmp = 0;
        for (int i = 0; i < numberOfNumbers; i++) {


            tmp += inputNumber();
        //    System.out.println(i + " lcxba: " + tmp);
        }
        System.out.println(tmp);
    }

    static int inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        return input.nextInt();
    }
}

