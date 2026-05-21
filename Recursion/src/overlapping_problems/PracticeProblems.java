package overlapping_problems;

import java.util.HashMap;
import java.util.Map;

public class PracticeProblems {

    //save my fibonacci numbers using memoization
    private static Map<Integer, Long> fibMap = new HashMap<>();

    public static void main() {
        System.out.println("fib(3) = " + fib(3));
        System.out.println("fib(6) = " + fib(6));
        System.out.println("fib(8) = " + fib(8));
        System.out.println("fib(9) = " + fib(9));
        System.out.println("fib(20) = " + fib(20));
        System.out.println("fib(30) = " + fib(30));
        System.out.println("fib(50) = " + fib(50));
        System.out.println("fib(100) = " + fib(100));
    }

    public static long fib(int num) {
        if (num < 0) throw new ArithmeticException("negative fibonacci indices not defined");

        //two base cases handled here fib(0) and fib(1)
        if (num <= 1) {
            return num;
        }

        //recursively find the two smaller fib numbers
        long fibM1 = findNthFib(num - 1);
        long fibM2 = findNthFib(num - 2);

        //fib(n) = fib(n - 1) + fib(n - 2)
        return fibM1 + fibM2;
    }

    private static long findNthFib(int index) {
        if (fibMap.containsKey(index)) { //reuse the number if we already found it
            return fibMap.get(index);
        } else { //otherwise recursively find the number
            long number = fib(index);
            fibMap.put(index, number);
            return number;
        }
    }
}
