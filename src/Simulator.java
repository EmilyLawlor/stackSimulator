public class Simulator {

    public static void main(String[] args) {

        Stack stack = new Stack();
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("push")) {
                stack.push(args[i + 1]);
                i++;
            } else if (args[i].equals("pop")) {
                stack.pop();
            } else if (args[i].equals("show")){
                stack.show();
            }
        }
    }

}
