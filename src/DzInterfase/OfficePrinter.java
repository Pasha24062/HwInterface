package DzInterfase;

public class OfficePrinter implements Printer{
    private InjectPrinter injectPrinter;
    @Override
    public void print(String message) {
        injectPrinter.print("Завдання виконанно");

    }
}
