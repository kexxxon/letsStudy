package ch08;

public class Ex15_FinallyTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
		// ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ� ����
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
