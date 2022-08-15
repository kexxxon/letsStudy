package controlloop;

public class Ex04_26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 100) {
            // above code could same as follows to two lines below
            // sum += ++i;
            // sum <= 100;
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
