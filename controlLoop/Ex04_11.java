package controlloop;

import java.util.Scanner;

public class Ex04_11 {
    public static void main(String[] args) {
        System.out.print("주민등록번호를 입력하세요. (001234-2221212) >");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        // 입력받은 번호의 8번째 문자를 gender에 저장
        char gender = regNo.charAt(7);

        switch(gender) {
            case '1': case '3':
                switch(gender) {
                    case '1':
                        System.out.println("2000년 이전 출생 남자");
                        break;
                    case '3':
                        System.out.println("2000년 이후 출생 남자");
                        break;
                }

                break;
            case '2': case '4':
                switch(gender) {
                    case '2':
                        System.out.println("2000년 이전 출생 여자");
                        break;
                    case '4':
                        System.out.println("2000년 이후 출생 여자");
                        break;
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
