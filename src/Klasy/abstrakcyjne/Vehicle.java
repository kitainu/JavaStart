package Klasy.abstrakcyjne;

public abstract class Vehicle {
    private int speed;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    // metoda abstrakcyjna
    public abstract void speedUp();
}
