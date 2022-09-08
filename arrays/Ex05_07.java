package arrays;

public class Ex05_07 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }

        System.out.println();

        // repeat 100 times
        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        // repeat as long as numArr.length
        for(int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        for (int newNumArr : numArr) {
            System.out.print(newNumArr);
        }
    }
}
