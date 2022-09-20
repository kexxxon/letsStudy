package oop;

public class FactorialTest01 {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    static int factorial(int n) {
        /* if
        if(n == 1) return 1;
        return n * factorial(n - 1);
         */

        /* while */
        int result = 1;
        while(n != 0) result *= n--;
        return result;
    }
}
