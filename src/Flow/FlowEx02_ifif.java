package Flow;
import java.util.Scanner;

public class FlowEx02_ifif {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
	 // char grade = 'D'; // �⺻ ���� ������ D�� �ʱ�ȭ�ϸ� else �� �ʿ� ����

		System.out.print("Enter your score> ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ���� 
		
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
