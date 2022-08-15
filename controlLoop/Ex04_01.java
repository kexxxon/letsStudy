package controlloop;

/*
    1. int type 변수 선언 및 초기화
    2. x가 변수 초기값일 때, 참인 것 출력
    3. 조건식
         x == 0일 때
         x != 0일 때
         !(x == 0)일 때
         !(x != 0)일 때
    4. 1부터 반복하는데, 변수에 다른 숫자 재할당
*/
public class Ex04_01 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x가 %d 일 때, 참인 것: %n", x);

        if(x == 0) System.out.println("x == 0");
        if(x != 0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");

        x = 1;
        System.out.printf("x가 %d 일 때, 참인 것: %n", x);

        if(x == 0) System.out.println("x == 0");
        if(x != 0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");
    }
}
