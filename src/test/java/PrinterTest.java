import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer(20, 10);
    }

    @Test
    public void hasSheets(){
        assertEquals(20, testPrinter.getSheets());
    }

//    @Test
//    public void printerPrints(){
//        assertEquals(10, testPrinter.printPreperation(2, 5));
//    }

    @Test
    public void printTest(){
        assertEquals(20, testPrinter.print(2, 10));
    }

    @Test
    public void noSheetsTest(){
        assertEquals("Fill me up buddy", testPrinter.noPrint(32, 43));
    }

    @Test
    public void fillPrinterTest(){
        assertEquals(120, testPrinter.fillPrinter());
    }

    @Test
    public void useTonerTest(){
        assertEquals(2, testPrinter.useToner(2, 4));
    }
}
