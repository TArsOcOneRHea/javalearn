package _2_oop.hw_1_class;
/*

 */
public class Car {
    private double efficiency;
    protected double fuel;
    protected double x;

    Car (final double argEfficiency) {
        this.efficiency = argEfficiency;
        this.x = 0;
        this.fuel = 0;
    }

    public final double getEfficiency() {
        return this.efficiency;
    }

    public final void setEfficiency(final double Efficiency) {
        if (Efficiency <= 0) {
            System.out.println("Efficiency must be positive");
        }
        this.efficiency = Efficiency;
    }

    public final double getFuel() {
        return this.fuel;
    }

    public final void addFuel(final double argFuel) {
        if (argFuel <= 0) {
            System.out.println("Fuel must be positive");
        }
        this.fuel = this.fuel + argFuel;
    }

    public final double getX() {
        return this.x;
    }


    public final void drive(final double distance) {
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


    public static void main(String[] args) {
        System.out.println("Here is the car with efficiency 7.7.");
        Car car = new Car(12.1);
        System.out.println("Add 20 litre of gas.");
        car.addFuel(20);
        System.out.printf("Your fuel: %f\n", car.getFuel());
        System.out.println("Drive 300 kilometres.");
        car.drive(300);
        System.out.printf("Your position: %f\n", car.getX());
        System.out.printf("Your fuel: %f\n", car.getFuel());

        System.out.println("Add 60 litre of gas.");
        car.addFuel(60);
        System.out.printf("Your fuel: %f\n", car.getFuel());
        System.out.println("Drive 500 kilometres.");
        car.drive(500);
        System.out.printf("Your fuel: %f\n", car.getFuel());
        System.out.printf("Your position: %f\n", car.getX());
    }
}
