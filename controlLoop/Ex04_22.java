package controlloop;

public class Ex04_22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int arrSum : arr) {
            sum += arr.length - 1;
        }
        System.out.println("sum: " + sum);
    }
}
