package Flow;

public class FlowEx09_while01 {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		// i �� 1�� �������� sum�� ��� ����
		while(sum <= 100) {
			System.out.printf("%d: %d%n", i, sum);
			sum += ++i;
		}
	}
}
