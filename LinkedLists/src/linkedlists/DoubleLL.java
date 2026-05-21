package linkedlists;

public class DoubleLL<T> {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLL() {

    }

    public void add(T element) {
        if (head == null) {
            head = tail = new Node(element);
        } else {
            //add to the end
            Node newNode = new Node(element);
            tail.next = newNode; //point old end of the list to new node
            newNode.prev = tail; //point new node to old end of list
            tail = tail.next;    //point tail to the new end of the list
        }
        size++;
    }

    public void addFirst(T element) {
        if (head == null) {
            head = tail = new Node(element);
        } else {
            Node newNode = new Node(element);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public boolean removeFirst() {
        if (head == null) {
            return false;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
        return true;
    }

    public void addLast(T element) {
        if (head == null) {
            head = tail = new Node(element);
        } else {
            Node newNode = new Node(element);

            //adjust references
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean removeLast() {
        if (head == null) {
            return false;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            //move to the next-to-last node
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T search) {
        return false;
    }

    public boolean remove(T search) {
        return false;
    }

    public void printList() {
        if (head == null) {
            System.out.println("head -> null");
            return; //exit
        }

        System.out.print("head -> ");

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private class Node {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
        }

        public String toString() {
            return " <- " + data.toString() + " -> ";
        }
    }
}
