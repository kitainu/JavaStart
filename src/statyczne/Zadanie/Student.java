package statyczne.Zadanie;

public class Student {
    private String name;
    private String surname;
    private int index;
    public static int numberOfStudent;


    public Student( String name, String surname, int index){
        this.name= name;
        this.surname=surname;
        this.index=index;
        numberOfStudent++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname=surname;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index=index;
    }
}
