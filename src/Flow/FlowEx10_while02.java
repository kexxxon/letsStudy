package Flow;

public class FlowEx10_while02 {

	public static void main(String[] args) {
		int num = 12345, sum = 0;
		
		// 10���� ������ ������ �ϸ� ������ �ڸ� ����
		// System.out.println(12345 % 10);
		
		// for
//		for(num = 12345; num > 0; num = num / 10) {
//			System.out.println(num); // num ���� ��ȭ: 12345 > 1234 > 123 > 12 > 1
//			System.out.println(num % 10); // num % 10 ���� ��ȭ:5 > 4 > 3 > 2 > 1
//
//			sum += num % 10;
//		}
		
		// while
		while(num > 0) {
			sum += num % 10;
			
			System.out.println("num%10: " + num % 10 + ", sum: " + sum);
			
			num /= 10;
		}
		
		System.out.println("�� �ڸ����� ��: " + sum);
	}
}
