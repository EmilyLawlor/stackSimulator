import java.util.ArrayList;
import java.util.List;

public class Stack {
    /**
     *
     * initialises an empty stack and supplies methods to add, remove elements to the stack, and a method to view the
     * element at the top of the stack and to view the entire stack
     *
     */
    private List<String> stack;
    private int cursor;

    public Stack() {
        this.stack = new ArrayList<String>();
        this.cursor = 0;
    }

    /**
     *
     * add a new element to the top of the stack, move the cursor onto this element
     *
     * @param element String element that will be added to the top of the stack
     */
    public void push(String element){
        this.stack.add(element);
        this.cursor += 1;
    }

    /**
     *
     * take the element of the top of the stack and return it, move the cursor back to the element that was previously
     * second on the stack and is no at the top
     *
     * @return the element that was at the top of the stack
     */
    public String pop(){
        this.cursor -= 1;
        return this.stack.remove((this.cursor));
    }

    /**
     * prints the element at the top of the stack to the console
     */
    public void top(){
        System.out.println(this.stack.get((this.cursor-1)));
    }

    /**
     * prints the entire stack, starting from the top working down
     */
    public void print(){
        int i = this.cursor - 1;
        while (i>=0){
            System.out.println(this.stack.get(i));
            i--;
        }
        System.out.println();
    }
}


