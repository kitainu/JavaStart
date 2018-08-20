package rekurencja;

public class Sum {
    public static void main(String[] args) {

        System.out.println(Sum.sumNumber(20));
    }
       public static int sumNumber(int n){
            if(n>1)
                return n + sumNumber(n-1);
            else
                return n;
        }



}
