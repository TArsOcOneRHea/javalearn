package Homework._2_oop.hw_2_encapsulation;

public class Circle extends Point {
    private int radius;



    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double square(){
        System.out.print("Area of a circle - ");
        double square = Math.pow(getRadius(),2) * 3.14;
        return square;
    }

    public double length(){
        System.out.print("Circumference - ");
        double length = getRadius() * 2 * 3.14;
        return length;
    }
}
