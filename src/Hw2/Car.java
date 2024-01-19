package Hw2;

public class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void service() {
        System.out.println("Перевірка та заміна фільтрів, масла");
    }


}
