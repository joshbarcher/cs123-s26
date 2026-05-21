package linkedlists;

public class TestDLL {
    static void main() {
        DoubleLL<Integer> listOfNums = new DoubleLL<>();

        listOfNums.add(1);
        listOfNums.add(2);
        listOfNums.add(3);
        listOfNums.printList();

        listOfNums.addLast(4);
        listOfNums.printList();

        while (!listOfNums.isEmpty()) {
            listOfNums.removeLast();
            listOfNums.printList();
        }
    }
}
