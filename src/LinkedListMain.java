public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(70);
        
        Node prevNode = linkedList.head;
        while (prevNode.data != 56) {
            prevNode = prevNode.next;
        }

        linkedList.insertAfter(prevNode, 30);

       
        linkedList.display();
    }
    
}
