package bag;

import java.util.Arrays;

public class Bag implements Collection {
    private static final int DEFAULT_CAP = 10;

    private String[] items;
    private int size;
    private int nextIndex; //holds next empty spot

    public Bag() {
        items = new String[10];
    }

    public Bag(int capacity) {
        items = new String[capacity];
    }

    public boolean add(Object obj) {
        //is the bag full?
        if (nextIndex == items.length) {
            return false;
        }

        //fill the spot at nextIndex, O(1)
        items[nextIndex] = obj.toString();
        size++;
        nextIndex++;
        return true;
    }

    /**
     * Returns the total space in the bag
     */
    public int capacity() {
        return items.length;
    }

    /**
     * Returns the number of elements in the Bag
     */
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object obj) {
        return false;
    }

    public boolean remove(Object search) {
        return false;
    }

    /**
     * Overrides Object.toString() and shows
     * the elements in the bag.
     */
    public String toString() {
        //static method on the Arrays class
        return Arrays.toString(items);
    }
}
