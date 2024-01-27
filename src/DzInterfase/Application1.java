package DzInterfase;

public class Application1 {
    public static void main(String[] args) {
        InjectPrinter injectPrinter = new InjectPrinter();
        OfficePrinter officePrinter = new OfficePrinter();
        officePrinter.print("Перемога");
    }
}
