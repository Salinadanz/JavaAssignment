import java.lang.Math;

abstract class Shape {
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {
    double RectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double SquareArea(double side) {
        return side * side;
    }

    double CircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        // creating an object of Area class
        Area obj = new Area();

        // calling all the three methods
        System.out.println("Area of Rectangle: " + obj.RectangleArea(4, 5));
        System.out.println("Area of Square: " + obj.SquareArea(4));
        System.out.println("Area of Circle: " + obj.CircleArea(4));
    }
}
