package Loops;

import java.util.Scanner;

public class Zadnie1_1 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę powtorzen: ");

        int wynik = 0;


        int numerOfNumbers = inputNumber();
        do {
            System.out.println(("podaj liczbe: "));
            wynik += inputNumber();
            numerOfNumbers--;
        } while (numerOfNumbers > 0);
        System.out.println("wynik: " + wynik);
    }

    static int inputNumber() {
        // Scanner input = new Scanner(System.in);
        //  int out=input.nextInt();
        //   return out;
        return new Scanner(System.in).nextInt();
    }

}
