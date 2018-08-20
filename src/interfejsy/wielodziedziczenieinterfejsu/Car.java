package interfejsy.wielodziedziczenieinterfejsu;

public interface Car {
    default public void printName(){
        System.out.println("Car");
    }

}
