package Exception;

public class Ex06_makeException {
	public static void main(String[] args) {

		try {	// Exception�� �� �ڼ��� ����ó�� �ʼ�
			throw new Exception();	// Exception ���Ƿ� �߻���Ŵ
		} catch(Exception e) { }

		// RuntimeException�� �� �ڼ��� ����ó�� ������ �ʾƵ� ������ ��
		throw new RuntimeException();
	}
}
