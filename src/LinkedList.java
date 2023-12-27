public class LinkedList {
    Node head;

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(56);
        linkedList.head.next = new Node(30);
        linkedList.head.next.next = new Node(70);

       
        linkedList.display();
    }
}
