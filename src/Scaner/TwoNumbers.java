package Scaner;

import java.util.Locale;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("podaj liczbe: ");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("podaj liczbe: ");
        String Napis = input.nextLine();

        input.close();
        System.out.println(a+" "+ Napis);
    }
}
