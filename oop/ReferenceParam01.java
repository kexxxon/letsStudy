package oop;

class referenceData { int x; }

public class ReferenceParam01 {
    public static void main(String[] args) {
        referenceData data = new referenceData();
        data.x = 10;
        System.out.println("main(): x = " + data.x);

        change(data);
        System.out.println("After change(d)");
        System.out.println("main(): x = " + data.x);
    }

    static void change(referenceData data) {
        data.x = 1000;
        System.out.println("change(): x = " + data.x);
    }
}
