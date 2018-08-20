package Loops.zad2_hospital;

public class Patient {
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getPESEL() {
        return PESEL;
    }

    public void setPESEL(long PESEL) {
        this.PESEL = PESEL;
    }

    private String imie;
    private String nazwisko;
    private long PESEL;

    public Patient(){};

   public Patient(String imie, String nazwisko, long PESEL){
       this.imie =imie;
       this.nazwisko=nazwisko;
       this.PESEL=PESEL;
   }

    @Override
    public String toString() {
//       String pcnt=(imie+" "+nazwisko+" "+PESEL);
//        return pcnt;
        return (imie+" "+nazwisko+" "+PESEL);
    }
}
