package rekurencja;

public class Add {

    public static int Add(int a, int b){
        if(a==0)
            return b;
        else
           return Add(--a,--b);
    }

    public static void main(String[] args) {
        System.out.println(Add(7,10));
    }
}
