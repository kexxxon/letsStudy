package Exception;

public class Ex04_printStackTrace {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception Message: " + ae.getMessage());
		} catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(4);
	}
}
