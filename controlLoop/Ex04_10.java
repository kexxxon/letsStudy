package controlloop;

import java.util.Scanner;

public class Ex04_10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("1~100 사이의 점수를 입력하세요.> ");

        // 입력받은 점수를 tmp(문자열)에 저장 후 숫자로 변환
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.printf("학점은 %c입니다.", grade);
    }
}
