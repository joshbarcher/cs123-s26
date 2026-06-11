package generics.intro;

public class TestGenerics {
    public static void main() {
        ObjectStorage num = new ObjectStorage(20);
        ObjectStorage string = new ObjectStorage("Hello");
        ObjectStorage flag = new ObjectStorage(true);

        //we need to cast our values back to their original type (shape)
        String stringValue = (String)string.getData();
        int intValue = (int)num.getData();

        System.out.println(intValue + 10);
        System.out.println(stringValue.toUpperCase());
        System.out.println(flag.getData());

        //generics are better!
        DataStorage<Integer> genNumber = new DataStorage<Integer>(20);
        DataStorage<String> genString = new DataStorage<String>("Hello");
        DataStorage<Boolean> genFlag = new DataStorage<Boolean>(true);

        System.out.println(genNumber.getData() + 10);
        System.out.println(genString.getData().toUpperCase());

        //this only works with booleans! (not Boolean)
        if (genFlag.getData() == true) {

        }
    }
}












