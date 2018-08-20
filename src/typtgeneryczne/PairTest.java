package typtgeneryczne;

import SpecyfikatorDostępu.Car;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>(125,"Lala");
        Pair<String,String> stringPair = new Pair<>("half", "half");
        Pair<Integer, Integer> intPair = new Pair<Integer, Integer>(2,1);
        Pair<Car, Car> carPair = new Pair<>(new Car(1234, "branc", "model", "color"),
                new Car(1234, "branc", "model", "color"));

        PairTest.print(p1);
        PairTest.print(carPair);
        PairTest.print(intPair);
        PairTest.print(stringPair);

        System.out.println(p1
        );
}



    public static <T,V> void print(Pair<T, V> pair) {
        System.out.println(pair.getT() + " " + pair.getV());

    }
}
