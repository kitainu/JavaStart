package SpecyfikatorDostępu;

public class Main {
    public static void main(String[] args) {
        Private priv =new Private();
        //System.out.println(priv.text);
        //błąd bo nie mamy dostępu do ola text
        priv.print();
    }
}
