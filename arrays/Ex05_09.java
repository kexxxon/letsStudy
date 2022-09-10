package arrays;

import java.util.Arrays;

public class Ex05_09 {
    public static void main(String[] args) {
        // array with discontinuous number
        int[] disc = {-1, 3, -5, 7, -9};

        // new array with size 10
        int[] arr = new int[10];

        // Randomly insert discontinuous values into the new created arr
        for(int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * disc.length);
            arr[i] = disc[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
