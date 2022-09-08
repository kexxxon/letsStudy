package arrays;

public class Ex05_05 {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;

        int[] score = {8, 10, 9, 9, 10};

        for(int scoreElement : score)
            sum += scoreElement;

        avg = sum / (float)score.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
