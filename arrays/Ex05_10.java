package arrays;

import java.util.Arrays;

public class Ex05_10 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;

            for(int j = 0; j < arr.length - 1 - i; j++) {
                // compare arr[j] and arr[j + 1] elements
                // if the left value to compare is greater than right value
                // switch it each other
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    changed = true;
                }
            }

            // break if no change position
            if(!changed) break;

            for(int k = 0; k < arr.length; k++)
                System.out.print(arr[k]);

            System.out.println();
        }
    }
}
