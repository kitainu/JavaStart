package interfejsy.wielodziedziczenieinterfejsu;

public interface Boat {
    default public void printName(){
        System.out.println("Boat");
    }
}
