package DzInterfase;

public class Rectangle implements  Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 *(width+height);
    }

    @Override
    public void display() {
        System.out.println("Це прямокутник");

    }
}
