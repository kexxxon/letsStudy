package controlloop;

public class Ex04_14 {
    public static void main(String[] args) {
//        for(int i = 1, j = 10; i <= 10; i++, j--)
//            System.out.printf("%d \t %d%n", i, j);

        for(int i = 1; i <= 1; i++) {
           for(int j = 5; j >= i; j--) {
               System.out.println("i: " + i + ", " + "j: " + j);
           }
        }
    }
}
