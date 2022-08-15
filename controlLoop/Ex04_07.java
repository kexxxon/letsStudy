package controlloop;

import java.util.Scanner;

public class Ex04_07 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.> ");

        // 사용자 입력 받은 숫자를 user에 저장하고 1, 2, 3중 하나를 com에 저장
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1;

        System.out.printf("당신: %d\n", user);
        System.out.printf("컴퓨터: %d\n", com);

        switch(user-com) {
            case 3: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1: case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
        }
    }
}
