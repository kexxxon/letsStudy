package Array;

public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;	// ������ �����ϱ� ���� ����
		float avg = 0f; // ����� �����ϱ� ���� ����
		
		int[] score = {95, 100, 93, 100, 98};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float)score.length; // ��� ����� flaot�� ��� ���� ����ȯ
		
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
	}
}
