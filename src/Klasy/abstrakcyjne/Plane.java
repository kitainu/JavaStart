package Klasy.abstrakcyjne;

public class Plane extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed()+20);
    }

    public static void main(String[] args) {
        Vehicle car = new Car() ;
        Vehicle plane = new Plane();
        car.speedUp();
        plane.speedUp();
        System.out.println("Speed of car: " + car.getSpeed());
       System.out.println("Speed of plane: " + plane.getSpeed());


    }
}
