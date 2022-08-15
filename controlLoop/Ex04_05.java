package controlloop;

import java.util.Scanner;

public class Ex04_05 {
    public static void main(String[] args) {

        // 점수 저장할 변수 선언 및 초기화
        int score = 0;
        // 등급과 옵션(+, -)을 저장할 문자 타입 변수 선언 및 초기화
        char grade = ' ';
        char opt = '0';

        // 출력: "점수를 입력해주세요.> "
        System.out.print("점수를 입력해주세요.> ");

        // 사용자 입력 받기 => Scanner class
        Scanner scanner = new Scanner(System.in);
        // 입력받은 점수 저장
        score = scanner.nextInt();
        // 출력: "당신의 점수는 __입니다."
        System.out.printf("당신의 점수는 %d입니다.", score);

        // 점수가 90점보다 같거나 크면 A
        if(score >= 90) {
            grade = 'A';

            // 98점 이상: A+
            if(score >= 98) opt = '+';
            // 94점 미만: A-
            else if(score < 94) opt = '-';
        }

        // 점수가 80점보다 같거나 크면 B
        else if(score >= 80) {
            grade = 'B';

            // 88점 이상: B+
            if(score >= 88) opt = '+';
            // 84점 미만: B-
            else if(score < 84) opt = '-';
        }

        // 나머지 C
        else grade = 'c';

        // 출력: "당신의 학점은 __ __ 입니다."
        System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
    }
}
