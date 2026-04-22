package linkedlists;

public class TestList {
    static void main() {
        LinkedList colors = new LinkedList();

        colors.add("blue");
        colors.add("pink");
        colors.add("orange");
        colors.add("chartruese");
        colors.add("purple");

        for (int i = 1; i <= 100; i++) {
            colors.add("gray");
        }
        System.out.println(colors);
    }
}
