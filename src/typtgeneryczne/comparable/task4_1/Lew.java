package typtgeneryczne.comparable.task4_1;

public class Lew implements  Comparable<Lew> {

    private String name;

    public Lew(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Lew o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return "Lew " + name;
    }

}
