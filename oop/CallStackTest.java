package oop;

public class CallStackTest {
    public static void main(String[] args) {
        System.out.println("start: main(String[] args");
        firstMethod();
        System.out.println("end: main(String[] args");
    }

    static void firstMethod() {
        System.out.println("start: firstMethod()");
        secondMethod();
        System.out.println("end: firstMethod()");
    }

    static void secondMethod() {
        System.out.println("start: secondMethod()");
        System.out.println("end: secondMethod()");
    }
}
