package linkedlists;

public class LinkedList {
    //access to all nodes through the first node
    private Node head;
    private int size;

    public LinkedList() {
        //???
    }

    public void add(Object obj) {
        //if the list is empty, add the first element
        if (head == null) {
            head = new Node(obj);
        } else {
            //use another variable, don't alter "head" reference
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new Node(obj);
        }
    }

    //returns true if obj is in the list, otherwise false
    public boolean contains(Object obj) {
        return false;
    }

    //print out the linked list in the format head -> A -> B -> C -> D -> null
    public void printList() {

    }

    //a nested (inner) class
    public class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
        }
    }
}
