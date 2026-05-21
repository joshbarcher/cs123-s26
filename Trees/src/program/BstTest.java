package program;

import trees.BinarySearchTree;

public class BstTest {
    static void main() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(11, 8, 17, 14, 23, 13, 15);

        System.out.println(tree);
    }
}
