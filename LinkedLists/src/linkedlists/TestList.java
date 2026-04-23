package linkedlists;

public class TestList {
    static void main() {
        LinkedList colors = new LinkedList();

        colors.add("blue");
        colors.add("pink");
        colors.add("orange");
        colors.add("chartruese");
        colors.add("purple");
        colors.add("yellow");
        colors.add("gray");

//        for (int i = 1; i <= 100; i++) {
//            colors.add("gray");
//        }
        colors.printList();
        while (!colors.isEmpty()) {
            System.out.println(colors.removeFirst());
            colors.printList();
        }

//        System.out.println(colors.contains("orange"));
//        System.out.println(colors.contains("purple"));
//        System.out.println(colors.contains("blue"));
//        System.out.println(colors.contains("brown"));
    }
}
