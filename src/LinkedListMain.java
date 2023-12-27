public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        int searchKey = 30;
        Node result = linkedList.search(searchKey);

        if (result != null) {
            System.out.println("Node with key " + searchKey + " found");
        } else {
            System.out.println("Node with key " + searchKey + " not found");
        }
    }
    
}
