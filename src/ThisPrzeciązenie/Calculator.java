package ThisPrzeciązenie;

public class Calculator {

    int add(int a, int b){

        return a+b;
    }
    int add(int a, int b, int c){
        return add(a,b)+c;

    }
    int substract(int a, int b){
        return a-b;
    }
    double substract(int a, double c){
        return a-c;
    }

    void printResult(int result){

        System.out.println(result);
    }
}
