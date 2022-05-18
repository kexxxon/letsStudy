package Flow;
import java.util.Scanner;

public class FlowEx02_ifif {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
	 // char grade = 'D'; // 기본 학점 변수를 D로 초기화하면 else 블럭 필요 없음

		System.out.print("Enter your score> ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장 
		
		System.out.printf("Your score is %d ", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score < 74) {
				opt = '-';
			}
		} else {
			grade = 'D';
		}
		
		System.out.printf("and grade is %c%c.", grade, opt);
	}
}
