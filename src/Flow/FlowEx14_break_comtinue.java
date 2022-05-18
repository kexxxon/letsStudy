package Flow;
import java.util.Scanner;

public class FlowEx14_break_comtinue {

	public static void main(String[] args) {
		
		int menu, num = 0;
		
		Scanner s = new Scanner(System.in);
		
		outer:  // while문에 outer라고 이름 붙임
		while(true) {
			System.out.println("원하는 메뉴를 선택하세요. *종료: 0");
			System.out.println("1. Square");
			System.out.println("2. Square Root");
			System.out.println("3. Log");
			
//			menu = Integer.parseInt(s.nextLine());
			String tmp = s.nextLine();    // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. *종료: 0");
				continue;
			}
			

			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
			
			for(;;) { // 무한반복문
				System.out.println("계산할 값을 입력하세요. *계산 종료: 0, 전체 종료: 99");
				
				tmp = s.nextLine();    		 // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
				
				if(num == 0)
					break;	// 계산 종료. for문 벗어잠
				
				if(num == 99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("result: " + num * num);
					break;
				case 2:
					System.out.println("result: " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result: " + Math.log(num));
					break;
				}
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
