package Array;

public class Ex13_StringClass {
	public static void main(String[] args) {
		//            01234
		String str = "ABCDE";
		char ch = str.charAt(3);
		System.out.println(ch);
		
		String str2 = str.substring(1, 4);
		System.out.println(str2);
		
		String str3 = str.substring(1); // 1 뒤에 str.length() 생략
		System.out.println(str3);
	}
}
