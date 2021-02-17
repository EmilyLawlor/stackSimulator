import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class TestSimulator{
    private static Simulator stack;

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

}