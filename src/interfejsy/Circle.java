package interfejsy;

public class Circle implements Shapes {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Shapes.PI * r *r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Shapes.PI *r;
    }
}
