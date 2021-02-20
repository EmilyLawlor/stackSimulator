import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TestSimulator{
    private static Simulator stack;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void testingPushFunction(){
        Simulator stack = new Simulator();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        ArrayList<String> testStack = new ArrayList<String>();
        testStack.add("first");
        testStack.add("second");
        testStack.add("third");
        assertEquals(testStack, stack.getStack().getStack());
    }


    @Test
    public void testingPopFunction() {
        Simulator stack = new Simulator();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        String element = stack.pop();
        assertEquals("third", element);
    }

    @Test
    public void testingShowFunction(){
        System.setOut(new PrintStream(outputStreamCaptor));

        Simulator stack = new Simulator();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        String expected = "third" + "\r\n" + "second" + "\r\n" + "first";
        stack.show();

        assertEquals(expected, outputStreamCaptor.toString()
                .trim());
    }


    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

}