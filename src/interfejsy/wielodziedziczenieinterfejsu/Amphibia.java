package interfejsy.wielodziedziczenieinterfejsu;

public class Amphibia implements Car, Boat {
    public void printName(){
        System.out.println("Amphibia to trochę");
        Car.super.printName();
        System.out.println("a trochę");
        Boat.super.printName();
    }
}
