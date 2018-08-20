package Equals.Zadanie;

public class DataStore {

    public static final int NUMBER_OF_COMP = 100;
    static int i = 0;


 private Computer[] computers = new Computer[100];

    public void add(Computer computer) {
        {
            if (i < NUMBER_OF_COMP) {
                computers[i] = computer;
                i++;
            }
        }

    }
    public int checkAvilability(Computer computer){
        int count =0;
        for(int i =0; i<computers.length; i++) {
           if(computer.equals(computers[i])){
               count++;
           }
        }return count;
    }
}
