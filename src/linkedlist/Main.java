package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

//        System.out.println("BEFORE ------");


        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
