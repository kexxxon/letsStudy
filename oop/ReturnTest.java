package oop;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest returnTest = new ReturnTest();

        int result01 = returnTest.add(3, 5);
        System.out.println(result01);

        int[] result02 = {0};
        returnTest.add(3, 5, result02);
        System.out.println(result02[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
