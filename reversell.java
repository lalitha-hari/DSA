
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

//     public void reverse() {
//         Node prev = null;
//         Node temp=head;
//         Node front;

//         while (temp != null) {
//             front=temp.next;  
//             temp.next = prev;  
//             prev = temp;       
//             temp = front;
//         }
//         head = prev;  
//     }

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
//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
// }

// public class reversell {
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.add(10);
//         list.add(20);
//         list.add(30);
//         list.add(40);
//         list.add(50);

//         System.out.print("Original List: ");
//         list.printList();

//         // Reverse the linked list
//         list.reverse();

//         System.out.print("Reversed List: ");
//         list.printList();
//     }
// }
