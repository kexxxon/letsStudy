package Exception;

public class Ex01_trycatch {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e1) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
