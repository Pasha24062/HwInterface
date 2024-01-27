package DzInterfase;

public class InjectPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println("InjecPrinter" + message);
    }
}
