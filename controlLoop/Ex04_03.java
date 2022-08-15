package controlloop;

import java.util.Scanner;

/*
    1. 출력: "숫자를 하나 입력하세요.> "
    2. 사용자 입력 받기 => Scanner class
    3. 입력받은 숫자를 input에 저장
    4. 조건
        4-1. 입력값이 0이면 출력: 입력하신 숫자는 0입니다.
        4-2. 입력값이 0이 아니면: 입력하신 숫자는 0이 아니라 __입니다.
 */

public class Ex04_03 {
    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요.> ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 0) System.out.println("입력하신 숫자는 0입니다.");
        if(input != 0) System.out.printf("입력하신 숫자는 0이 아니라 %d입니다.", input);
    }
}
