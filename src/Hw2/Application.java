package Hw2;

public class Application {
    public static void main(String[] args) {
        Car car = new Car("Honda","CRV",2007);
        car.service();
        Motorcycle motorcycle = new Motorcycle("Kovi","start",2021);
        motorcycle.service();
    }
}
