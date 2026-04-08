package program;

import bag.Bag;

public class Main {
    public static void main(String[] args) {
        //test the bag
        Bag bag = new Bag(5);

        bag.add("socks");
        bag.add("shirt");
        bag.add("hat");
        bag.add("shorts");
        bag.add("shoes");

        boolean added = bag.add("belt"); //there should not be room!
        if (!added) {
            System.out.println("Bag is full!");
        }

        System.out.println("Capacity: " + bag.capacity());
        System.out.println("Size: " + bag.size());

        System.out.println(bag);

        //try removing an element
        bag.remove("shirt");
        bag.remove("shorts");

        System.out.println(bag);
    }
}
