package Scaner;

public class Calc {
    static final String addNumb = " +";
    static final String minusNumb = "-";
    static final String multiNumb = "*";
    static final String divNumb = "/";

    public double calculation(double a, double b, String operation) {
        double result = 0;

        switch (operation) {
            case addNumb:
                result = a + b;
                break;
            case minusNumb:
                result = a - b;
                break;
            case multiNumb:
                result = a * b;
                break;
            case divNumb:
                result = a / b;
                break;
        }
        return result;
    }
}
