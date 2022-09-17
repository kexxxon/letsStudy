package oop;

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;

        // above two lines in one line
        // return a + b;
    }
        long subtract(long a, long b)     { return a - b; };
        long multiply(long a, long b)     { return a - b; };
        double divide(double a, double b) { return a / b; }
}

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.subtract(5L, 3L);
        long result3 = myMath.multiply(5L, 3L);
        double result4 = myMath.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}
