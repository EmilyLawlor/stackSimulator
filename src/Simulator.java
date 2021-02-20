public class Simulator {

    /**
     *
     * simulator class initialises new, empty stack
     * calls the appropriate methods of the stack class which match the parameter passed in from the command line
     *
     * @param args command sequence passed in from command line
     */
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
