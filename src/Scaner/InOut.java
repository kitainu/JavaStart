package Scaner;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        System.out.println("podaj imię: ");
        firstName = input.nextLine();
        System.out.println("podaj nazwisko: ");
        lastName = input.nextLine();
        System.out.println("podaj wiek: ");
        age = input.nextInt();
        input.close();

    }

}
