package typtgeneryczne.comparable;

import java.util.Arrays;

public class ProductCatalog {
    public static void main(String[] args) {
        Producent[] products = new Producent[7];
        products[0] = new Producent("Amino", "Zupa pomidorowa", "Zupy");
        products[1] = new Producent("Amino", "Zupa ogórkowa", "Zupy");
        products[2] = new Producent("Winiary", "Zupa pomidorowa", "Zupy");
        products[3] = new Producent("Winiary", "Zupa pomidorowa", "Zupy błyskawiczne");
        products[4] = new Producent("Winiary", "Rozsół", "Zupy");
        products[5] = new Producent("Knorr", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Producent("Knorr", "Racuchy", "Dania obiadowe");


        System.out.println("Nieposortowana");

        System.out.println(products);
        for (Producent p : products)
        System.out.println(p);

        Arrays.sort(products);
        System.out.println("Posortowana");
        for(Producent p: products){
            System.out.println(p);
        }
    }
}
