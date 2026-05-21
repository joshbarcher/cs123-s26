package bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public void add(int... elements) {
        for (int elem : elements) {
            add(elem);
        }
    }

    public void add(int element) {
        if (root == null) {
            root = new Node(element);
            size++;
        }
        else {
            add(element, root);
        }
    }

    private void add(int element, Node current) {
        if (current.data == element) {
            return;
        }
        else if (current.data > element)
        {
            if (current.left == null) {
                current.left = new Node(element);
                size++;
            }
            else {
                add(element, current.left);
            }
        }
        else {
            if (current.right == null) {
                current.right = new Node(element);
                size++;
            }
            else {
                add(element, current.right);
            }
        }
    }

    public boolean contains(int search) {
        return contains(root, search);
    }

    private boolean contains(Node current, int search) {
        if (current == null) return false;

        if (current.data == search) {
            return true;
        } else if (current.data < search) {
            //look to the right
            return contains(current.right, search);
        } else {
            //look to the left
            return contains(current.left, search);
        }
    }

    //TODO eek!
    public boolean remove(int search) {
        return false;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return "Root: " + root + ", size: " + size;
    }

    private class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }
}