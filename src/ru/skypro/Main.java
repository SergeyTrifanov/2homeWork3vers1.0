package ru.skypro;

public class Main {

    public static void main(String[] args) {
	    Bicycle bicycle = new Bicycle("аист", 2);
        System.out.println("bicycle = " + bicycle);
        Car car = new Car("Lada", 4);
        System.out.println("car = " + car);
        Truck truck = new Truck("камаз", 6);
        System.out.println("truck = " + truck);

        bicycle.check();
        car.check();
        truck.check();

    }

}
