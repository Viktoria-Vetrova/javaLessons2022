package task09;

public class Main {

    public static void main(String[] args) {
        ListPrinter<String> stringListPrinter = new ListPrinter<>();

        stringListPrinter.add("1");
        stringListPrinter.add("2");
        stringListPrinter.add("3");
        stringListPrinter.add("4");
        stringListPrinter.add("5");

        stringListPrinter.printList(true);
        stringListPrinter.printList(false);


        Stack<String> stack = new Stack<>();

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.printf("Size: %d\n",stack.size());

        stack.push("1");
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack);
        System.out.printf("Size: %d\n",stack.size());

        System.out.println(stack.pop());
        System.out.printf("Size: %d\n",stack.size());

        System.out.println(stack.peek());
        System.out.printf("Size: %d\n",stack.size());

        System.out.println(stack);
    }
}
