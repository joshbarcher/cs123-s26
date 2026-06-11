package iterators;

import java.util.Iterator;

public class RangeTest {
    static void main() {
        Range range = new Range(5, 15);
        System.out.println(range);

        //instantiate the iterator
        Iterator<Integer> iterator = range.iterator();
        while (iterator.hasNext()) {
            int elem = iterator.next();
            System.out.println(elem);
        }

        for (int elem : range) {
            System.out.println(elem);
        }
    }
}
