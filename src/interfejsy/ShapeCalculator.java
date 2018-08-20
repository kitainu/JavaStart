package interfejsy;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shapes circle = new Circle(5);
        Shapes rect = new Rectangle(5,2.5);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Pole prostokąta: " + rect.calculatePerimeter());
    }
}
