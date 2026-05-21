package trees;

public class BinarySearchTree {
    private TreeNode root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public void add(int... nums) {
        for (int num : nums) {
            add(num);
        }
    }

    public boolean add(int num) {
        //is the tree empty
        if (root == null) {
            root = new TreeNode(num);
            size++;
        } else { //recurse to find where the element goes in the tree
            //begin searching at root
            add(root, num);
        }
        return false;
    }

    private void add(TreeNode current, int num) {
        //no duplicates!
        if (current.data == num) {
            return;
        } else if (current.data < num) {
            //look to the right child
            if (current.right == null) {
                //we found the spot where the new element goes!
                current.right = new TreeNode(num);
                size++;
            } else {
                add(current.right, num);
            }
        } else {
            //look to the left child
            if (current.left == null) {
                //we found the spot where the new element goes!
                current.left = new TreeNode(num);
                size++;
            } else {
                add(current.left, num);
            }
        }
    }

    //this should use recursion to find out whether an element
    //is in the tree or not
    public boolean contains(int num) {
        return contains(root, num);
    }

    private boolean contains(TreeNode current, int num) {
        if (current == null) return false;

        if (current.data == num) {
            return true;
        } else if (num < current.data) {
            return contains(current.left, num);
        }
        else {
            return contains(current.right, num);
        }
    }

    public boolean remove(int element) {
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public String toString() {
            return String.valueOf(data);
        }
    }
}
