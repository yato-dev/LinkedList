public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(40);
        linkedList.append(70);

    
        linkedList.display();

        int deleteKey = 40;
        boolean deleted = linkedList.delete(deleteKey);
        if (deleted) {
            System.out.println("Node with key " + deleteKey + " deleted");
        }

    
        linkedList.display();
        
      
        System.out.println("Size of the Linked List: " + linkedList.size());
    }
}
