package Tablice2;

public class MultiDimensional1 {
    public static void main(String[] args) {
        int[] longTab = new int[1000];
        longTab[99] = 100; //99 element tablicy
        int[] midTab  = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][]; // tworzenie tablicy wielowymiarowej
        hugeTab[0]= longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println(hugeTab[0].length+ ";" + hugeTab[1].length+ " ;" + hugeTab[2].length) ;
    }
}
