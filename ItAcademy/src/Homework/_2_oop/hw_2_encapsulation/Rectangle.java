package Homework._2_oop.hw_2_encapsulation;

public class Rectangle extends Point {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public double square(){
        System.out.print("Square of rectangle - ");
        double square  = getX() * getY();
        return square;
    }
}
