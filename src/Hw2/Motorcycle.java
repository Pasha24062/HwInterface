package Hw2;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void service() {
        System.out.println("Перевірка та заміна масла");
    }

}
