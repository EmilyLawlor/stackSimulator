import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> stack;
    private int cursor;

    public Stack() {
        this.stack = new ArrayList<String>();
        this.cursor = 0;
    }

    public void push(String element){
        this.stack.add(element);
        this.cursor += 1;
    }

    public String pop(){
        this.cursor -= 1;
        return this.stack.remove((this.cursor));
    }

    public void top(){
        System.out.println(this.stack.get((this.cursor-1)));
    }

    public void print(){
        int i = this.cursor - 1;
        while (i>=0){
            System.out.println(this.stack.get(i));
            i--;
        }
        System.out.println();
    }
}


