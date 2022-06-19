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
		// 프로그램 설치에 필요한 준비를 하는 코드 적기
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
