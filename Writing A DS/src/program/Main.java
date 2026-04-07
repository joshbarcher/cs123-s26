package program;

import bag.Bag;

public class Main {
    public static void main() {
        //test the bag
        Bag bag = new Bag(5);

        bag.add("socks");
        bag.add("shirt");
        bag.add("hat");

        System.out.println("Capacity: " + bag.capacity());
        System.out.println("Size: " + bag.size());

        System.out.println(bag);
    }
}
