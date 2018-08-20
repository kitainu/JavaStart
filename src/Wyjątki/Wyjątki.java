package Wyjątki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjątki  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = 0;
        boolean error = true;
        while(error){
        try{
            number = sc.nextInt();
            error = false;
        }catch(InputMismatchException ex) {
            System.err.println("Podana wartość nie jest liczbą całkowitą");
            sc.nextLine();
        }

        }
        System.out.println("podałeś: " + number);
        sc.close();
    }
}
