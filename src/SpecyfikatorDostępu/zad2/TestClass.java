package SpecyfikatorDostępu.zad2;

import SpecyfikatorDostępu.zad.Point;

public class TestClass {
    public static final int ADD_X = 1;
    public static final int ADD_Y =2;
    public static final int MINUS_X = 3;
    public static final int MINUS_Y = 4;

    public static void main(String[] args) {

        Point pointer = new Point(2,5);
        PointController poCo = new PointController();

       // poCo.changeObject(pointer);

        int choose = 1;
        switch(choose) {
            case 1:
                poCo.addX(pointer);

                break;
            case 3:
                poCo.minusX(pointer);

                break;
            case 2:
                poCo.addY(pointer);

                break;
            case 4:
                poCo.minusY(pointer);

                default:
                    System.out.println("value do not exist");
        }
        System.out.println(pointer.getX() + " " + pointer.getY());
    }



}
