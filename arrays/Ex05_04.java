package arrays;

import java.util.Arrays;

public class Ex05_04 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println("abc = " + Arrays.toString(abc));
        System.out.println("num = " + Arrays.toString(num));
        System.out.println(num);

        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println("result = " + Arrays.toString(result));

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println("num = " + Arrays.toString(num)); // num = [A, B, C, D, 4, 5, 6, 7, 8, 9]
        System.out.println(num); // ABCD456789

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println("num = " + Arrays.toString(num)); // num = [A, B, C, D, 4, 5, A, B, C, 9]
        System.out.println(num); // ABCD45ABC9
    }
}