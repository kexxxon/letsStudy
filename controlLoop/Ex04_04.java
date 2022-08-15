package controlloop;

import java.util.Scanner;

/*
    1. 점수 저장을 위한 int type 변수 선언 및 초기화 - score
    2. 학점 저장을 위한 char type 변수 선언및 초기화 - grade
    3. 출력: "점수를 입력하세요.> "
    4. 사용자 입력 받기 => Scanner class
    5. 입력받은 숫자를 score에 저장
    6. 조건
        6-1. score가 90보다 같거나 크면 grade A
        6-2. score가 80보다 같거나 크면 grade B
        6-3. score가 70보다 같거나 크면 grade C
        6-4. score가 나머지는 grade D
    7. 출력: "당신의 학점은 __입니다."
 */
public class Ex04_04 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.> ");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if(score >= 90) grade = 'A';
        else if(score >= 80) grade = 'B';
        else if(score >= 70) grade = 'C';
        else grade = 'D';

        System.out.printf("당신의 학점은 %c입니다.", grade);
    }
}