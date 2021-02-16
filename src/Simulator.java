public class Simulator {
    private Stack stack;

    public Simulator() {
        stack = new Stack();
    }

    public void push(String text){
        this.stack.push(text);
    }

    public String pop(){
        return this.stack.pop();
    }

    public void show() {
        this.stack.print();
    }
}
