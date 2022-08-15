package controlloop;

import java.util.Scanner;

public class Ex04_28 {
    public static void main(String[] args) {
        int input = 0, answer= 0;

        answer = (int)(Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the int between 1 to 100 > ");
            input = scanner.nextInt();

            if(input > answer)
                System.out.println("Try a small number");
            else
                System.out.println("Try a bigger number");
        } while(input != answer);

        System.out.println("Correct!");
    }
}
