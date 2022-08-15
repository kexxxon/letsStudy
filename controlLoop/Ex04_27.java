package controlloop;

import java.util.Scanner;

public class Ex04_27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;    // variable for condition of while loop

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for total (exit: press 0)");

        while(flag) {   // condition is true cause the flag value is true
            System.out.print("> ");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num != 0) sum += num;
            else flag = false;
        }

        System.out.println("total: " + sum);
    }
}
