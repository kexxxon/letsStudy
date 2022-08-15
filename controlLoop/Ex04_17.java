package controlloop;

import java.util.Scanner;

public class Ex04_17 {
    public static void main(String[] args) {

        System.out.print("출력할 *의 라인수를 입력하세요.> ");

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        // 입력받은 내용을 tmp에 저장
        String tmp = scanner.nextLine();
        // 입력받은 문자열(tmp)를 숫자로 저장
        num = Integer.parseInt(tmp);

        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
