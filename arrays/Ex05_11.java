package arrays;

import java.util.Arrays;

public class Ex05_11 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] cnt = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            cnt[arr[i]]++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + "의 개수: " + cnt[i]);
        }
    }
}
