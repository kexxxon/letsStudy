package ch09;

public class Ex10_String {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal);	// int를 String으로 변환
		String strVal = iVal + "";	// int -> String 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";  // int -> String 변환 또 다른 방법
		
		double sum = Integer.parseInt("+" + strVal);
	}
}
