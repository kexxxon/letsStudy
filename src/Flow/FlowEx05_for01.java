package Flow;

public class FlowEx05_for01 {

	public static void main(String[] args) {
		// for(�ʱ�ȭ; ���ǽ�; ������) { ������ ���� }
	 //	for(int i = 1; i <= 5; i++) {
	 //		System.out.println(i);
	 //	}
		
		// ',' �̿��ؼ� ���� 2�� ���� (���� Ÿ�� �����ؾߵ�)
		for(int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + ", j=" + j);
		}
	}
}
 