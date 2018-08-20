package Tablice2;

public class Zad {
    public static void main(String[] args) {
        double[ ] line1 = {1.0,1.5,2.0};
        double[] line2 = {1.5,2.0,2.5};
        double[] line3 = {2.0,2.5,3.0};
        double[][] meanTab = new double[3][3];

        meanTab[0] = line1;
        meanTab[1] = line2;
        meanTab[2] = line3;


         double sum = (meanTab[0][0] * meanTab[1][1] * meanTab[2][2])+(meanTab[0][2]*meanTab[1][1] * meanTab[2][0 ]);
                 System.out.println(sum);
    }
}
