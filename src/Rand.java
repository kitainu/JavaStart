import java.util.Random;

public class Rand {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10);
        int y= new Random().nextInt(10);
        System.out.println(x);
        System.out.println(y);


//        System.out.println("czy x >y ");
//        System.out.println(x>y);
//        System.out.println((x*2)>y);
//        System.out.println((y<(x+3))&&(y>(x-2)));
//        System.out.println((x*y)%2==0);
        System.out.println("x= "+x + "y = "+ y);
      boolean  result = x>y;
        System.out.println("x>y"+ result);
        result = x * 2>y;
        System.out.println("x * 2>y " + result);
        result = (y<x+3)&&(y>x-2);
        System.out.println( " (y<x+3)&&(y>x-2)" + result);
        result = ((x*y)%2==0);
        System.out.println("(x*y)%2==0 " + result);

    }



}
