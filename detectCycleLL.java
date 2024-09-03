
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class LinkedList {
//     Node head;

//     // Method to detect a cycle in the linked list
//     public boolean detect() {
//         Node slow = head;
//         Node fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 return true; 
//             }
//         }
//         return false; 
//     }

//     // Method to add a node to the linked list
//     public void add(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = newNode;
//         }
//     }

//     // Method to print the linked list
//     public void printList() {
//         Node temp = head;
//         Node start = head;
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;

//             // Detect if a cycle exists while printing
//             if (temp == start) {
//                 System.out.print("(Cycle detected)");
//                 break;
//             }
//         }
//         System.out.println();
//     }
// }
// class detectCyclell {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);


//         list.head.next.next.next.next.next = list.head.next;

//         // Check for cycle detection
//         if (list.detect()) {
//             System.out.println("Cycle detected in the linked list.");
//         } else {
//             System.out.println("No cycle in the linked list.");
//         }

//     }
// }
