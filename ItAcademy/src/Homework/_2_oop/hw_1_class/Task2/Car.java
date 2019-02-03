package Homework._2_oop.hw_1_class.Task2;

public class Car {
    private double efficiency;
    private double fuel;
    private double x;

    public Car(double efficiency, double fuel) {
        this.efficiency = efficiency;
        this.fuel = fuel;
        this.x = x;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        if (efficiency < 0) {
            System.out.println("Efficiency must be positive");
        }
        this.efficiency = efficiency;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void addFuel(final double argFuel) {
        if (argFuel <= 0) {
            System.out.println("Fuel must be positive");
        }
        this.fuel = this.fuel + argFuel;
    }

    public void drive(final double distance) {
        if (distance <= 0) {
            System.out.println("Distance must be positive");
        }
        double limit = this.fuel * this.efficiency;
        if (distance > limit) {
            System.out.printf("You're run out of gas. %f kilometres left.\n", distance - limit);
            this.x = this.x + limit;
            this.fuel = 0;
        } else {
            System.out.printf("You drived %f kilometres.\n", distance);
            this.x = this.x + distance;
            this.fuel = this.fuel - (distance / this.efficiency);
        }
    }

}
