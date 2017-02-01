package junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import greeting.Hello;

public class HelloTest {
    @Test
    public void testConsoleOutput() {
        // Create a stream to hold console output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        //Save the old System.out
        PrintStream oldSyso = System.out;
        // Tell java to use the pre-defined print stream
        System.setOut(ps);
        //Print output to specified stream:
        Hello helloWorld = new Hello();
        //Perform string validation
        String desired = "Hello, World!";
        assertEquals(desired, baos.toString());
        // Restore to previous settings
        System.out.flush();
        System.setOut(oldSyso);
    }
}
