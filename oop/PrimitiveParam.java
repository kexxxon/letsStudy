package oop;

class primitiveData { int x; }

public class PrimitiveParam {
    public static void main(String[] args) {
        primitiveData data = new primitiveData();
        data.x = 10;
        System.out.println("main(): x = " + data.x);

        change(data.x);
        System.out.println("After change(data.x)");
        System.out.println("main(): x = " + data.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change(): x = " + x);
    }
}
