package statyczne;

public class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam",184.5);
        Human ewa =  new Human("Ewa", 172.5);

        double avgHeight = (adam.getHeight() + ewa.getHeight())/2;
        Human.avgHeight =avgHeight;

        System.out.println(adam.getHeight() + " "+ adam.getName()+ "cm ");
        System.out.println(ewa.getHeight() + " "+ ewa.getName()+ "cm ");

        System.out.println("średni wzrost: ");
        System.out.println(ewa.avgHeight); //możliwe rozwiązanie
        System.out.println(adam.avgHeight); // możliwe rozwiązanie
        System.out.println(Human.avgHeight);

    }
}
