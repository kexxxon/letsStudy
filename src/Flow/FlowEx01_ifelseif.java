package Flow;
import java.util.Scanner;

public class FlowEx01_ifelseif {

	public static void main(String[] args) {
		int score = 0; // ������ �����ϴ� ����
		char grade = ' '; // ������ �����ϴ� ����. �������� �ʱ�ȭ
		
	 // char grade = 'D'; // �⺻ ���� ������ D�� �ʱ�ȭ�ϸ� else �� �ʿ� ����
		
		System.out.print("Enter your score> ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ���� 
		
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
