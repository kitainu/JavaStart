package typtgeneryczne;

public class Container<T> {
    //deklaracja tablicy
    private T[] array;
    public T[] getArray(){
        return array;
    }

    public void setArray(T[] array){
        this.array=array;
    }
    public T get(int index){
        return array[index];
    }

    public void printT() {
        String result = "";
        for (T t : array) {
            System.out.println(t);
            result = result + t;
        }
    }

}
