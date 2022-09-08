package arrays;

public class Ex05_08 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // Store values from 1 to 45 in each element of the array
        for(int i = 0; i < ball.length; i++) {
            ball[i] += i;
        }

        // System.out.print(Arrays.toString(ball)); // [1, 2, 3, ...,  43, 44, 45]

        // temporary variable to replace two values
        int tmp = 0;

        // variable for store arbitrary values
        int random = 0;

        // mix the values of the i-th element of the array and the values stored in any element.
        // change from 0 to 5th element - 6 times in total
        for(int i = 0; i < 6; i++) {
            random = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[random];
            ball[random] = tmp;
        }
        // print 6 random elements
        for(int i = 0; i < 6; i++)
            System.out.println("ball[" + i + "] = " + ball[i]);
    }
}
