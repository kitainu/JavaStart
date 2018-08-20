package Equals.Zadanie;

public class NotebookShop {

    public static void main(String[] args) {
        DataStore dataStore = new DataStore();


        Computer comp1 = new Computer("HP", 51254);
        Computer comp2 = new Computer("ACES", 122254);
        Computer comp3 = new Computer("HP", 51254);
        Computer comp4 = new Computer("Sony", 1254);
        Computer comp5 = new Computer(null,0);
        dataStore.add(comp1);
        dataStore.add(comp2);
        dataStore.add(comp3);
        dataStore.add(comp4);
        dataStore.add(comp5);
        dataStore.add(new Computer("Dell", 31241));

//dataStore.checkAvilability(comp1.equals(comp3));
        System.out.println("comp1.equals(comp1) :" + comp1.equals(comp1));
        System.out.println("comp1.equals(comp2) :" + comp1.equals(comp2));
        System.out.println("comp1.equals(comp3) :" + comp1.equals(comp3));
        System.out.println("comp1.equals(comp4) :" + comp1.equals(comp4));
        System.out.println("comp1.equals(null) :" + comp1.equals(comp5));
    }



}

