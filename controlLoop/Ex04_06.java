package controlloop;

import java.util.Scanner;

public class Ex04_06 {
    public static void main(String[] args) {
        // 출력: "현재 월을 입력하세요.> "
        System.out.print("현재 월을 입력하세요.> ");

        // 사용자 입력> Scanner class
        Scanner scanner = new Scanner(System.in);
        // 입력받은 숫자를 month에 저장
        int month = scanner.nextInt();

        // 조건문 - switch
        switch(month) {
            // 봄
            case 3: case 4: case 5:
                System.out.println("봄");
                break;

            // 여름
            case 6: case 7: case 8:
                System.out.println("여름");
                break;

            // 가을
            case 9: case 10: case 11:
                System.out.println("가을");
                break;

            // 겨울
            default:    // default 사용 시 확인되지 않은 값이 나올 때까지 처리하게 함
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
        }
    }
}
