package arrays;

import java.util.Arrays;

public class Ex05_06 {
    public static void main(String[] args) {
        int[] score = {10, 8, 9, 7, 10, 9, 10};

        // initialise max/min in first value from score
        int max = score[0];
        int min = score[0];

        // Initialize variable i to 1 to read from the second element of the array
        for(int i = 1; i < score.length; i++) {
            if(score[i] > max)
                max = score[i];
            else if(score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // solve it in a different way
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println(score[score.length - 1]); // max
        System.out.println(score[0]);                // min
    }
}
