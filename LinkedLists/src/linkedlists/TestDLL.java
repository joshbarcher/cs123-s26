package linkedlists;

public class TestDLL {
    static void main() {
        DoubleLL<Integer> listOfNums = new DoubleLL<>();

        listOfNums.add(1);
        listOfNums.add(2);
        listOfNums.add(3);

        listOfNums.printList();
    }
}
