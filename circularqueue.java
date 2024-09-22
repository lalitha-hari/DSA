class CircularQueue {
    private int[] queue; 
    private int front;   
    private int rear;   
    private int size;    
    private int capacity; 

    
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    
    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return false;
        }

        
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    
    public boolean dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return false;
        }

        
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    // Returns the front element of the queue
    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue[front];
    }

    // Returns the rear element of the queue
    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue[rear];
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Main method to test the CircularQueue
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5); // Create a queue with capacity 5

        // Enqueue elements
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);

        System.out.println("Front element is: " + cq.front()); // Should print 10
        System.out.println("Rear element is: " + cq.rear()); // Should print 40

        // Dequeue elements
        cq.dequeue();
        System.out.println("After dequeue, front element is: " + cq.front()); // Should print 20

        // Enqueue more elements
        cq.enqueue(50);
        cq.enqueue(60);

        System.out.println("After enqueuing more, rear element is: " + cq.rear()); // Should print 60

        // Check if queue is full
        System.out.println("Is the queue full? " + cq.isFull()); // Should print true

        // Try to enqueue in a full queue
        cq.enqueue(70); // Should print "Queue is full. Cannot enqueue 70."
    }
}
