package generics.practice;

public class TestPair {
    public static void main() {
        Pair<String, Integer> age = new Pair<>("Tad", 24);
        Pair<Double, Double> xy = new Pair<>(1.2, -5.8);

        System.out.println("Name: " + age.getFirst());
        System.out.println("Age: " + age.getSecond());
        System.out.println(xy);

        Pair<Double, Double> result = divideRemainder(10, 3);
        System.out.println("Result1: " + result.getFirst());
        System.out.println("Result2: " + result.getSecond());
    }

    public static Pair<Double, Double> divideRemainder(double num, double den) {
        if (den == 0) throw new ArithmeticException("Can't divide by zero");

        double division = num / den;
        double remainder = num % den;

        return new Pair<>(division, remainder);
    }
}
