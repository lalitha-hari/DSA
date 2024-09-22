import java.util.Stack;

class MinStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;


    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);


        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {

        if (mainStack.isEmpty()) {
            return;
        }


        int removedElement = mainStack.pop();


        if (removedElement == minStack.peek()) {
            minStack.pop();
        }
    }


    public int top() {
        
        return mainStack.peek();
    }


    public int getMin() {

        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStack stack = new MinStack();
        
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(3);
        
        System.out.println("Minimum: " + stack.getMin()); // Should print 3
        stack.pop();
        System.out.println("Minimum: " + stack.getMin()); // Should print 3
        stack.pop();
        System.out.println("Minimum: " + stack.getMin()); // Should print 3
        stack.pop();
        System.out.println("Minimum: " + stack.getMin()); // Should print 5
    }
}
