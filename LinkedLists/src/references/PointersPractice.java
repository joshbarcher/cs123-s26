package references;

public class PointersPractice {
    static void main() {
        Cat cat1 = new Cat("Lola", "Long Hair");
        Cat cat2 = new Cat("Milo", "Grey Cat");
        Cat cat5 = new Cat("Ginny", "Hairless");

        System.out.println(cat1);
        System.out.println(cat2);

        //"copied" the variable, "copied" the value in the variable (memory address)
        Cat cat3 = cat1;
        System.out.println(cat3);

        Cat cat4 = cat1; //= cat3;

        //make a change to the object "referenced" in cat1
        cat1.setName("Lola Furrball");
        cat3.setName("Lola The Queen");
        cat4.setName("Lola The Messy");

        System.out.println(cat1.getName());
        System.out.println(cat3.getName());
        System.out.println(cat4.getName());

        //java garbage collector - background process, reclaim memory
        //for objects "no longer in use" (aka no references to the object)
        cat1 = null;
        cat3 = null;
        cat4 = null;

        //what happens now?
    }
}
