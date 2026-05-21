package call_stack;

public class CallStackTest {
    private static int methodCount = 0;

    public static void main() {
        //start our recursion
        foo();
    }

    public static void foo() {
        methodCount++;
        System.out.println("Method #" + methodCount);
        foo();
    }
}
