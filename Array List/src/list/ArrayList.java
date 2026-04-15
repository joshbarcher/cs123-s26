package list;

import java.util.*;

public class ArrayList<T> implements Collection<T>, List<T> {
    private static final int INITIAL_CAPACITY = 5;

    private T[] data;
    private int size; //AKA nextIndex...

    public ArrayList() {
        data = (T[])new Object[INITIAL_CAPACITY];
    }

    public boolean add(T newElem) {
        //detect if the array is full
        if (data.length == size) {
            resize();
        }

        data[size] = newElem;
        size++;
        return true;
    }

    private void resize() {
        //create a new array, replace the old array
        T[] oldData = data;
        data = (T[])new Object[data.length * 2]; //increase by 100%

        //copy over all elements to the new array
        for (int i = 0; i < oldData.length; i++) {
            data[i] = oldData[i];
        }
    }

    public void add(int index, T element) {

    }

    public T get(int index) {
        validateIndex(index);
        return data[index];
    }

    private void validateIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    //returns the old value after replacing it
    public T set(int index, T element) {
        validateIndex(index);

        T oldValue = data[index];
        data[index] = element; //replaces the old value in the list
        return oldValue;
    }

    public boolean remove(Object o) {
        return false;
    }

    public T remove(int index) {
        return null;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public void clear() {

    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public String toString() {
        return Arrays.toString(data);
    }
}
