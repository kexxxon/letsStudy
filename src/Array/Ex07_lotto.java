package Array;
import java.util.Arrays;

public class Ex07_lotto {
	public static void main(String[] args) {
		
		// index ����: 0~44
		int[] ball = new int[45]; // 45���� �������� �����ϱ� ���� �迭
		
		// �迭 �� ����� 1~45 �� ����
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball[0]�� 1���� �����
		}
		
		int tmp = 0; // �� ���� �ٲٴ� �� ����� �ӽú���
		int j = 0;	 // ������ ���� �� ������ ����
		
		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ����
		// 0~5 ��ұ��� 6���� ����
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0~44 ������ ������ �� ���
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			
			System.out.println(Arrays.toString(ball));
		}
		
		// �迭 ball �տ������� 6�� ��� ���
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]: %d%n", i, ball[i]);
		}
	}
}
