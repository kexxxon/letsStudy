package controlloop;

import java.util.Scanner;

public class Ex04_08 {
    public static void main(String[] args) {
        System.out.print("주민등록번호를 입력하세요. (001234-2221212) >");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();;

        // 입력받은 번호의 8번째 문자를 gender에 저장
        char gender = regNo.charAt(7);

        switch(gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
