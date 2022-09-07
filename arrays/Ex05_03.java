package arrays;

public class Ex05_03 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // [0, 0, 0]

        for(int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        // arr[0] = 0 + 1;
        // arr[1] = 1 + 1;
        // arr[2] = 2 + 1;

        System.out.println("변경 전");
        System.out.println("arr.length: " + arr.length); // 3

        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] = " + arr[i]);
        // arr[0] = 0
        // arr[1] = 1
        // arr[2] = 2

        int[] tmp = new int[arr.length * 2]; // [0, 0, 0, 0, 0, 0]

        for(int i = 0; i < arr.length; i++)
            tmp[i] = arr[i]; // [1, 2, 3]

        arr = tmp;  // [1, 2, 3, 0, 0, 0]

        System.out.println("변경 후");
        System.out.println("arr.length: " + arr.length); // 6

        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] = " + arr[i]);
        // arr[0] = 0
        // arr[1] = 1
        // arr[2] = 2
        // arr[3] = 0
        // arr[4] = 0
        // arr[5] = 0
    }
}
