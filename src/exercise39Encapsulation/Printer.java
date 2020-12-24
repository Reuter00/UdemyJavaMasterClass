package exercise39Encapsulation;

public class Printer {
    private int tonerLevel = -1, pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return tonerLevel;
            }
            else {
                return  this.tonerLevel = tonerLevel+ tonerAmount;
            }
        }


        return -1;
    }

    public int printPages(int pages){

         int pagesToPrint = pages;

         if (duplex = true )
         {
             if (pagesToPrint / 2 <= 1)
             {
                 pagesToPrint =1;
                 pagesPrinted = pagesPrinted + pagesToPrint;
             }
             else{
                 pagesToPrint = pagesToPrint / 2;

                 pagesPrinted = pagesPrinted + pagesToPrint;
             }

         }
        if (duplex = true) {
            System.out.println("Printing in duplex mode");
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
