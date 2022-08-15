package controlloop;

import java.util.Scanner;

public class Ex04_25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.print("Enter the number (ex.12345): ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while(num != 0) {
            // number divided by 10 plus sum
            sum += num % 10;
            System.out.printf("sum: %2d num: %d%n", sum, num);

            // assign the number divided 1by 10 in num again
            num /= 10;
        }

        System.out.println("sum of each number: " + sum);
    }
}
