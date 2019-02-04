package Homework._2_oop.hw_2_encapsulation;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
        return distance;
    }

    public Point translate(int x1, int y1){
        int newX = getX() + x1;
        int newY = getY() + y1;
        Point point = new Point(newX, newY);
        System.out.println("New point after translate: X - " + newX + ", Y - " + newY);
        return point;

    }

    public Point scale(int scale){
        int newX = getX() * scale;
        int newY = getY() * scale;
        Point point = new Point(newX, newY);
        System.out.println("New point after scale: X - " + newX + ", Y - " + newY);
        return point;
    }
}
