package car_parking;

 

import java.util.Random;
import java.util.Scanner;

 

public class CarParking {
    Car[] cars = new Car[5];

 

    public int parkCar(Car car) {
        System.out.println("Car");
        cars[0] = car;
        System.out.println("Car Details : " + cars[0]);

 

        int token = 567;
        cars[0].setTokon(token);
        System.out.println("Car Details : " + cars[0]);
        return token;
    }

 

    public void getCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getTokon() == car.getTokon()) {
                System.out.println("Car Found!!");
                cars[i] = null;
                break;
            } else
                System.out.println("Car Not Found");
        }
    }
}

class CarParking {

 

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setRegNo("TS1234");
        car1.setOwnerName("Aman");

 

        CarParking parking = new CarParking();
        int token = parking.parkCar(car1);
        car1.setTokon(token);
        System.out.println(car1);
        System.out.println(token);
        parking.getCar(car1);

 

    }
}