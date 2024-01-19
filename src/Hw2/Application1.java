package Hw2;

public class Application1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        OfficeWorker officeWorker = new OfficeWorker();
        officeWorker.doWork(printer, "Паспорт");
    }
}
