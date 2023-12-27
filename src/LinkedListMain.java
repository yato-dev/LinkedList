public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.display();

        int searchKey = 30;
        linkedList.insertAfter(searchKey, 40); 

      
        linkedList.display();
    }
}
