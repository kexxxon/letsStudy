package Exception;

public class Ex09_reThrowing {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó����");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó����");
			throw e;
		}
	}
}