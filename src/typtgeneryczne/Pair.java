package typtgeneryczne;

import SpecyfikatorDostępu.Car;

public class Pair<T, V> {
    private T t;
    private V v;

    public Pair(V v, T t){
        this.v=v;
        this.t=t;


    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public void set(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Pair{" + "t=" + t + ", v=" + v + '}';
 }
}
