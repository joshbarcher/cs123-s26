package bag;

public interface Collection {
    boolean add(Object obj);
    boolean remove(Object search);
    void clear();
    boolean contains(Object obj);
    int size();
    boolean isEmpty();
}
