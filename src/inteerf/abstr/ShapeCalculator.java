package inteerf.abstr;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(5,10);

        System.out.println(" Pole koła: " +
        circle.calculateArea() + " Obwód prostokąta " +
        rect.caclculatePerimeter());
    }
}
