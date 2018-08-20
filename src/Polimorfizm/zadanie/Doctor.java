package Polimorfizm.zadanie;

public class Doctor extends Person {
    private int premia;

    public Doctor(String name, String lastName, int payment,
                  int premia) {
        super(name, lastName, payment);
        setPremia(premia);
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public int getPremia() {
        return premia;
    }

}
