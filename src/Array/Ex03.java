package Array;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// ���̰� 5�� int �迭 ���� & �ʱ�ȭ
		int[] iArr = {65, 75, 85, 95, 100};
		
		// System.out.println(iArr); // [I@515f550a
		
		// �迭 ��� ���
		// ��� 1. �ݺ���
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}

		// ��� 2. Arrays.toString �޼��� ���
		System.out.println(Arrays.toString(iArr)); // [65, 75, 85, 95, 100]
		// Arrays�޼���: �迭�� ������ ���ڿ��� ���� ��ȯ
	}
}
