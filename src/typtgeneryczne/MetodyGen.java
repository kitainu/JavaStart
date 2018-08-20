package typtgeneryczne;

public class MetodyGen {
    public static void main(String[] args) {
        MetodyGen gm = new MetodyGen();
        gm.print5Times("Grześ");
        gm.print5Times(7);
    }
    public <T> void print5Times(T arg){
        for(int i =0; i<5; i++){
            System.out.println(arg);


        }

    }
}
