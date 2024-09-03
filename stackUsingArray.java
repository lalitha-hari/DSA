class Stack{
   int[] stack;
   int top;
   int capacity;

   public Stack(int size){
    stack=new int[size];
    capacity=size;
    top=-1;
   }
   public void push(int value){
    if (isfull()){
        System.out.println("Stack overflow cannot pust");
        return;
    }
    stack[++top]=value;
    System.out.println("Pushed value "+value);
   }

   public int pop(){
    if (isEmpty()){
        System.out.println("Stack underflow");
        return -1;
        
    }
    System.out.println("popped "+stack[top]);
    return top--;
   }

   public int peek(){
    if (isEmpty()){
        System.out.println("Stack empty");
        return -1;
    }
    return stack[top];
   }
   public boolean isEmpty() {
    return top == -1;
}
public boolean isfull() {
    return top == capacity - 1;
}
public int size() {
    return top + 1;
}
class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create a stack of capacity 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        stack.pop();
        stack.pop();  // Attempt to pop from an empty stack
    }
}
}
