package DzInterfase;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.display();
        System.out.println("Площа кола= " + circle.area());
        System.out.println("Периметр кола= " + circle.perimeter());
        System.out.println("================");
        Rectangle rectangle = new Rectangle(5,8);
        rectangle.display();
        System.out.println("Площа прямокутника= " + rectangle.area());
        System.out.println("Периметр прямокутника= " + rectangle.perimeter());
    }
    }
