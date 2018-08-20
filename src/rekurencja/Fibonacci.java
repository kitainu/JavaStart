package rekurencja;

public class Fibonacci {


    public static int oblicz(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n >= 2)
            return oblicz(n - 1) + oblicz(n - 2);
        return oblicz(n-1)+ oblicz(n-2);
        }

    public static void main(String[] args) {
        System.out.println(Fibonacci.oblicz(5));
    }
}
