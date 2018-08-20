package Loops.zad2_hospital;

public class Hospital {
    Patient[] kolejkaPacjentow = new Patient[10];
    private int i = 0;
    private final int LIMIT = 10;

    void addPacjent(Patient patient) {
        if (i < LIMIT) {
            kolejkaPacjentow[i] = patient;
            i++;
        } else{
            System.out.println("There is no more place");
        }
    }

    void showPaients() {
        for (Patient pacjent : kolejkaPacjentow) {
            System.out.println(pacjent.toString());
        }
    }

}
