package String;

public class StringSTime {
    public static void main(String[] args) {
        //zmienne które pozwolą zapisać infoermacje o czasie tworzenia obiektów

        long time1, time2;
// aktualny czas odczytany przez metodę System.nanoTime
        long startTime = System.nanoTime();
//tworzymy obiekt stringBuilder
        StringBuilder builder = new StringBuilder();
        //budujemy napis
        for(int i =0; i<1000; i++) {
          //  przypisujemy kolejną liczbę
        builder.append(i);
        //przypisujemy spację
            builder.append(" ");
        }
        //napis przypisujemy do zmiennej nubers
        String numbers = builder.toString();
        // czas tworzenia obietów
        time1=System.nanoTime() - startTime;
        System.out.println("Time1:" + time1);
        System.out.println(numbers);

        startTime = System.nanoTime();
        String numbers2 = "";
        for(int i =0; i<1000;i++){
            numbers2 = numbers2 + i + "";
        }
        time2 = System.nanoTime() - startTime;
        System.out.println("Time2:" + time2);
        System.out.println(numbers2);

        System.out.println("Time2/Time1:" + time2/time1);

    }
}
