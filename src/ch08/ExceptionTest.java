package ch08;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			// System.out.println(0/0);   // ArithmeticException
			System.out.println(args[0]);  // ArrayIndexOutOfBoundsException
			System.out.println(4);
			
		/* 없어도 실행 가능
		} catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		*/
			
		} catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
		} catch(Exception e) {
			// 모든 예외의 최고 조상: Exception
			System.out.println("Exception");
		}
		System.out.println(5);
	}
}
