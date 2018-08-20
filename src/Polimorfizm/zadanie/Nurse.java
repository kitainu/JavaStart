package Polimorfizm.zadanie;

public class Nurse extends Person {
    private int overtime;

    public void setOvertime(int overtime){
        this.overtime=overtime;
    }
    public int getOvertime(){
        return  overtime;
    }

    public Nurse(String name, String lastName, int payment,
                 int overtime){
        super(name, lastName, payment);
        this.overtime = overtime;
    }
}
