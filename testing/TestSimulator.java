import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * JUnit methods to test the three main functions of the stack class, the push, pop and show functions
 */
public class TestSimulator{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * testing the push function
     * 3 elements to a stack, then creates an ArrayList with the same elements in the same order and compares the
     * stack against this ArrayList to ensure they are the same and the the elements were pushed to the stack correctly
     */
    @Test
    public void testingPushFunction(){
        Stack stack = new Stack();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        ArrayList<String> testStack = new ArrayList<>();
        testStack.add("first");
        testStack.add("second");
        testStack.add("third");
        assertEquals(testStack, stack.getStack());
    }


    /**
     * testing the pop function
     * pushes 3 elements to a stack and the pops the last element back of the stack and checks that the correct element
     * was returned
     */
    @Test
    public void testingPopFunction() {
        Stack stack = new Stack();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        String element = stack.pop();
        assertEquals("third", element);
    }

    /**
     * testing the show function
     * creates new stack with 3 elements and calls the function show()
     * captures the printed output of the function call and ensure it is the same as the expected output
     */
    @Test
    public void testingShowFunction(){
        System.setOut(new PrintStream(outputStreamCaptor));

        Stack stack = new Stack();
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