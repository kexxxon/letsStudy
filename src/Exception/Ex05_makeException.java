package Exception;

public class Ex05_makeException {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e; // 예외를 발생시킴
			
			// throw new Exception("고의로 발생시킴"); // 위 두줄을 한줄로
			
		} catch(Exception e) {
			System.out.println("에러: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
