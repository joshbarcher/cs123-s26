package bag;

public interface Collection {
    boolean add(Object obj);
    boolean remove(Object search);
    boolean contains(Object obj);
    int size();
    boolean isEmpty();
}
