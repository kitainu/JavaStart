package Scaner;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double a = input.nextDouble();
        input.nextLine();
        String operation = input.nextLine();
        double b = input.nextDouble();

        Calc calc = new Calc();
        double result = calc.calculation(a,b,operation);
        System.out.println(a + operation + b + " ="+ result);
    }
}
