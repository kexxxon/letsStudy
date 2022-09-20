package oop;

public class MainTest {
    public static void main(String[] args) {
        main(null); // StackOverflowError - recursive call
    }
}
