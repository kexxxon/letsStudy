package controlloop;

public class Ex04_23 {
    public static void main(String[] args) {
        int i = 5;

        while(i-- != 0) {
            System.out.println(i + ": Never give up!");
        }

        // same expression the above while loop
        // understanding better than the above
//        while(i != 0) {
//            i--;
//            System.out.println(i + ": Never give up!");
//        }
    }
}
