package tests;

import java.util.HashSet;
import java.util.TreeSet;

public class SetOperations {
    static void main() {
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        addColors(setA, "pink", "yellow", "orange", "blue", "blue");
        addColors(setB, "blue", "purple", "yellow", "white", "brown");

        System.out.println(setA);
        System.out.println(setB);

        //setA.addAll(setB); //A union B -> result is in set A
        //setA.retainAll(setB); //A intersect B -> result is in set A
        setA.removeAll(setB); //A difference B -> result is in set A

        System.out.println("Difference: " + setA);
        System.out.println("Unchanged: " + setB);
    }

    private static void addColors(HashSet<String> set, String... colors) {
        for (String color : colors) {
            set.add(color);
        }
    }
}
