package controlloop;

public class Ex04_29_01 {
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++) {
            if(i % 3 != 0)
                System.out.println("i: " + i);
            else if(i != 0)
                System.out.printf("i: %d 짝\n", i);
        }

    }
}
