package test;

import java.util.Arrays;

public class SimpleHashTable {
    static void main() {
        String[] inputs = { "behoove", "quicksilver", "perseverate", "indubitably",
                            "rheteric", "ludicrous" };

        String[] hashtable = new String[20];

        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];

            //Note: Java can produce negative mods
            int index = Math.abs(input.hashCode() % hashtable.length);
            hashtable[index] = input;
        }

        System.out.println(Arrays.toString(hashtable));
    }

    private static void hashingInts() {
        int[] inputs = { 55, 4, 42, 10, 98, 18, 18, 33, 64, 20 };
        int[] hashtable = new int[50];
        int collisions = 0;

        for (int i = 0; i < inputs.length; i++) {
            int input = inputs[i];

            //place the number into the table
            int index = input % hashtable.length;

            //scan until we have an empty spot
            while (hashtable[index] != 0) {
                collisions++;

                if (hashtable[index] == input) {
                    break;
                }

                //increment and normalize to an index
                index = (index + 1) % hashtable.length;
            }
            hashtable[index] = input;
        }

        System.out.println(Arrays.toString(hashtable));
        System.out.println("Collisions: " + collisions);

        //mod operator is awesome!
        // 10 % 10 = 0
        // 11 % 10 = 1
        // 12 % 10 = 2
        // 13 % 10 = 3
        // 14 % 10 = 4
        // 15 % 10 = 5
        // 16 % 10 = 6
        // 17 % 10 = 7
        // 18 % 10 = 8
        // 19 % 10 = 9
        // 20 % 10 = 0
        // 21 % 10 = 1
        // 22 % 10 = 2
        // 23 % 10 = 3
        // 24 % 10 = 4
        // 25 % 10 = 5
    }
}
