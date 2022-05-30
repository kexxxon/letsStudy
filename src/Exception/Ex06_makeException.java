package Exception;

public class Ex06_makeException {
	public static void main(String[] args) {

		try {	// Exception과 그 자손은 예외처리 필수
			throw new Exception();	// Exception 고의로 발생시킴
		} catch(Exception e) { }

		// RuntimeException과 그 자손은 예외처리 해주지 않아도 컴파일 됨
		throw new RuntimeException();
	}
}
