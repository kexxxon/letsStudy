package Flow;
import java.util.Scanner;

public class FlowEx01_ifelseif {

	public static void main(String[] args) {
		int score = 0; // 점수를 저장하는 변수
		char grade = ' '; // 학점을 저장하는 변수. 공백으로 초기화
		
	 // char grade = 'D'; // 기본 학점 변수를 D로 초기화하면 else 블럭 필요 없음
		
		System.out.print("Enter your score> ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장 
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("Your grade is " + grade);
	}
}
