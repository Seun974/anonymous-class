package se.lexicon.samuel;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }
    //this method handles the duplex printing style. mine was more of a single page printer
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode ");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}





//my implementation below;
//private int tonerLevel = 0;
//    private int numberOfPAgesPrinted = 0;
//    private boolean duplexPrinter;
//
//    public Printer(int tonerLevel, boolean duplexPrinter) {
//        this.tonerLevel = tonerLevel;
//        this.duplexPrinter = duplexPrinter;
//        this.numberOfPAgesPrinted = 0;
//    }
//    public void fillToner(int tonerAdded){
//        int tonerQuantity = tonerAdded + tonerLevel;
//        if (tonerQuantity == 100){
//            System.out.println("Toner level = 100%");;
//        }else if (tonerQuantity > 100){
//            System.out.println("Toner added too much. only " + (tonerAdded - tonerLevel) + " needed.");
//        } else {
//            System.out.println("Toner required = " + (100 - tonerQuantity));
//        }
//    }
//    public void printPage(int numberOfPAges){
//        int printed = numberOfPAgesPrinted += numberOfPAges;
//        System.out.println("number of pages printed is " + printed);
//    }
//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//    public int getNumberOfPAgesPrinted() {
//        return numberOfPAgesPrinted;
//    }
//
//    public boolean isDuplexPrinter() {
//        return duplexPrinter;
//    }