package Flow;
import java.util.Scanner;

public class FlowEx11_dowhile {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의 수 저장
		
		// 답 미리 알기
		System.out.println("Answer: " + answer);
		
		Scanner s = new Scanner(System.in);
		
		// while
//		System.out.print("Enter Integer between 1 and 100> ");
//		input = s.nextInt()	;
//		
//		while(input != answer) {
//			if(input > answer) {
//				System.out.println("Try again with a smaller number.");
//			} else if(input < answer){
//				System.out.println("Try again with a larger number.");
//			}
//			
//			System.out.print("Enter Integer between 1 and 100> ");
//			input = s.nextInt()	;
//			
//			// 입력 받는 코드가 중복되기 때문에 do-while 사용이 더 효율적
//		}
//		
//		System.out.println("Bammm!");
		
		// do-while
		do {
			System.out.print("Enter Integer between 1 and 100> ");
			input = s.nextInt()	;
			
			if(input > answer) {
				System.out.println("Try again with a smaller number.");
			} else if(input < answer){
				System.out.println("Try again with a larger number.");
			}
			
		} while(input != answer);
		
		System.out.println("Bammm!");
	}
}
