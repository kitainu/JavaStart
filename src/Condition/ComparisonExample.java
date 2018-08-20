package Condition;

public class ComparisonExample {
    public static void main(String[] args) {
        int a =10;
        int b = 30;
        int c = 20;
        // warunek zostaje sprawdzony
         if(a>b){
             System.out.println("a>b");
         }//wynik jest fałszywy więc:
        else if(b>c){
             System.out.println("b>c");
         }// warunek jest true więc już nie sprawdzamy następnego warunku
        else if(c>a){
             System.out.println("c>a");
         }// warunek nigdy nie zostanie sprawdzony

        //każdy z poniżsych warunków zostanie sprawdzony bo warunki nie zależą od siebie
        if(a>b){
            System.out.println("a>b");
        }if(b>c){
            System.out.println("b>c");
        }if(c>a){
            System.out.println(c>a);
        }
    }
}
