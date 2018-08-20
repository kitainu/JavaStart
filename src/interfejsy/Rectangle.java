package interfejsy;

public class Rectangle implements Shapes {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
public Rectangle(double a, double b){
        setA(a);
        setB(b);
}
    @Override
    public double calculateArea() {
        return  a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a +2 *b ;
    }
}
