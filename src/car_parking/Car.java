package car_parking;

class CarParking<Car> {
    Car[] cars = new Car[5];

 

    public int parkCar(Car car) {
        System.out.println("Car");
        cars[0] = car;
        System.out.println("Car Details : " + cars[0]);
        int token = 567;
        ((Object) cars[0]).setTokenNo(token);
        System.out.println("Car Details : " + cars[0]);
        return token;
    }

 

    public void getCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (((Object) cars[i]).getTokenNo() == ((Object) car).getTokenNo()) {
                System.out.println("Car Found!!");
                cars[i] = null;
                break;
            } else
                System.out.println("Car Not Found");
        }
    }
}

 

class CarParkingDemo {

 

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setRegNo(1234);
        car1.setOwnerName("Aman");

 

        CarParking parking = new CarParking();
        int token = parking.parkCar(car1);
        car1.setTokenNo(token);
        System.out.println(car1);
        System.out.println(token);

 


        parking.getCar(car1);

 

    }
}