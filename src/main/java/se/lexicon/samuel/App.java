package se.lexicon.samuel;

public class App {
    public static void main( String[] args ) {

    Printer printer = new Printer(50, true);
    int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was " + pagesPrinted + " new total for printer = " + pagesPrinted);
        pagesPrinted = printer.printPages(9);
        System.out.println("pages printed was " + pagesPrinted + " new total for printer = " + pagesPrinted);
    }
}










//my implementation
//Printer printer = new Printer(10,true);
//    printer.fillToner(50);
//            printer.printPage(20);