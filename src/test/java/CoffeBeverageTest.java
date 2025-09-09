import org.example.services.Coffe;
import org.example.services.Tea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CoffeBeverageTest {

    private Tea myTea;
    private Coffe myCoffe;
    private PrintStream outOriginal;
    private ByteArrayOutputStream byteOutputStream;

    @Before
    public void OnInit(){
        myTea = new Tea();
        myCoffe= new Coffe();
        outOriginal = System.out;
        byteOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteOutputStream));
    }

    @Test
    public void CoffeTest(){
        myCoffe.prepareRecipe();
        outOriginal = System.out;
        String outPrepareRecipe = byteOutputStream.toString().trim();
        Assert.assertEquals(outPrepareRecipe, "Boiling water\n" +
                "Brewing Coffee\n" +
                "Pouring into cup\n" +
                "Adding Coffee and Sugar");
    }

    @Test
    public void TeaTest(){
        myTea.prepareRecipe();
        outOriginal = System.out;
        String outPrepareRecipe = byteOutputStream.toString().trim();
        Assert.assertEquals(outPrepareRecipe, "Boiling water\n" +
                "Steeping the tea\n" +
                "Pouring into cup\n" +
                "Adding lemon and sugar");
    }
}
