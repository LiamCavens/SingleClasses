public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

//    public int printPreperation(int pages, int copies){
//        return pages * copies;
//    }

    public int print(int pages, int copies){
        if (pages * copies >= this.sheets){
            return pages * copies;
        } else {
            return 0;
        }

    }

    public String noPrint(int pages, int copies){
        if (pages * copies > this.sheets){
            return "Fill me up buddy";
        } else {
            return "Good to go";
        }
    }

    public int fillPrinter(){
        return this.sheets += 100;
    }

    public int useToner(int copies, int pages){
        return this.toner -= (copies * pages);
    }

}
