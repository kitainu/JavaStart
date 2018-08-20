package Condition;

public class HelloName {
    public static void main(String[] args) {
        final String krzysiek = "Krzysiek";
        final String maciek= "Maciek";
        final String marek = "Marek";

        String name = "Krzysiek";

        switch(name){
            case krzysiek:
                System.out.println("Siemano Krzysiek");

            case maciek: case marek:
                System.out.println("Witam panie prezesie");
                break;
            default:
                System.out.println("Witaj nieznajoma");
        }
    }
}
