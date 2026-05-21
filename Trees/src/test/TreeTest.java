package test;

import bst.BinarySearchTree;

public class TreeTest {
    static void main() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(100, 50, 80, 200, 150, 364, 16, 811, 900, 500);

        System.out.println(tree.contains(100));
        System.out.println(tree.contains(364));
        System.out.println(tree.contains(10));
    }
}
