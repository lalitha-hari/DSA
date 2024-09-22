import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> inputStack;  
    private Stack<Integer> outputStack; 

    public QueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Push element x to the back of queue
    public void enqueue(int x) {
        inputStack.push(x);
    }

    // Removes the element from in front of queue and returns that element
    public int dequeue() {
        if (outputStack.isEmpty()) {
            // Transfer elements from inputStack to outputStack only if outputStack is empty
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        if (outputStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return outputStack.pop();
    }

    // Get the front element without removing it
    public int peek() {
        if (outputStack.isEmpty()) {
            // Transfer elements from inputStack to outputStack if outputStack is empty
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        if (outputStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return outputStack.peek();
    }

    // Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        
        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element is: " + queue.peek()); // Should print 1
        System.out.println("Dequeue element is: " + queue.dequeue()); // Should print 1
        System.out.println("Front element is now: " + queue.peek()); // Should print 2
        System.out.println("Dequeue element is: " + queue.dequeue()); // Should print 2
        System.out.println("Is queue empty? " + queue.isEmpty()); // Should print false
        System.out.println("Dequeue element is: " + queue.dequeue()); // Should print 3
        System.out.println("Is queue empty? " + queue.isEmpty()); // Should print true
    }
}
