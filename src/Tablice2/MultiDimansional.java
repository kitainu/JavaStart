package Tablice2;

public class MultiDimansional {
    public static void main(String[] args) {
        String[] firstNames = {"Karol", "Basia", "Kasia"};
        String[] lastNames = {"Kowalski","Nowakowska", "Nosowska"};

        String[][]firstLast = {firstNames, lastNames};

        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
    }
}
