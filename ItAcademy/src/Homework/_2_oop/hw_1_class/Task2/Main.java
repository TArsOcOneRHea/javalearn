package Homework._2_oop.hw_1_class.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(12.10, 50);
        car.drive(1000);
        car.addFuel(30);
        car.drive(100);
        System.out.println("Position from starting point - " + car.getX());
    }
}
