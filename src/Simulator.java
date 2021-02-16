public class Simulator {
    /**
     *
     *  simulates the generic stack functionality
     *
     */
    private Stack stack;

    /**
     * initialises an empty stack
     */
    public Simulator() {
        stack = new Stack();
    }

    /**
     * adds the element "text" to the top of the stack
     * @param text element of type String to be added to teh stack
     */
    public void push(String text){
        this.stack.push(text);
    }

    /**
     * takes the element at the top of the stack off the stack and returns it
     * @return the element that was at the top of the stack
     */
    public String pop(){
        return this.stack.pop();
    }

    /**
     * prints each element of the stack on a new line, starting at the top (the item that was added most recently) down
     * to the bottom of the stack(item that was added first)
     */
    public void show() {
        this.stack.print();
    }
}
