package Metody.Zad;

public class Calculate {
    public static void main(String[] args) {
        double a =4.5;
        double b = 6.2;
        Calculator calculator = new Calculator();




        System.out.println(calculator.add(a,b));
        System.out.println(calculator.substract(a,b));
        System.out.println(calculator.multiply(4.5,6.2));
        System.out.println(calculator.divide(4.5,6.2));

    }
}
