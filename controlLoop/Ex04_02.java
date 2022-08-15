package controlloop;

import java.util.Scanner;

/*
    1. int type 변수 선언
    2. 출력: "숫자를 하나 입력하세요. >"
    3. 사용자 입력 받기 => Scanner class
    4. 사용자에게 입력받은 내용을 tmp에 저장 => nextLine()
    5. 입력받은 문자열(tmp)를 숫자로 변환 => Integer.parseInt()
    6. 조건
        6-1. 입력값이 0이면 출력: 입력하신 숫자는 0입니다.
        6-2. 입력값이 0이 아니면: 입력하신 숫자는 0이 아니라 __입니다.
 */
public class Ex04_02 {
    public static void main(String[] args) {
        int input;
        System.out.print("숫자를 하나 입력하세요.> ");

        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0) System.out.println("입력하신 숫자는 0입니다.");
        if(input != 0) System.out.printf("입력하신 숫자는 0이 아니라 %d입니다.", input);
    }
}
