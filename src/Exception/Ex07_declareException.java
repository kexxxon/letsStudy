package Exception;

public class Ex07_declareException {
	public static void main(String[] args) throws Exception {
		method1();	// ���� Ŭ���� �� static ����� => ��ü �������� ���� ȣ�� ����
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
}
