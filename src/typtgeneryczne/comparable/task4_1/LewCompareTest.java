package typtgeneryczne.comparable.task4_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LewCompareTest {
    public static void main(String... args) {
       Lew leon = new Lew("Leon");
       Lew simba = new Lew("Simba");
       Lew nala = new Lew("Nala");

       List<Lew> lwy = Arrays.asList(leon, simba, nala);

       System.out.println(lwy);

        Collections.sort(lwy);

        System.out.println(lwy);
    }
}
