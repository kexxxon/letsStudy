package ch09;

public class Ex10_String {
	public static void main(String[] args) {
		int iVal = 100;
//		String strVal = String.valueOf(iVal);	// int�� String���� ��ȯ
		String strVal = iVal + "";	// int -> String ��ȯ
		
		double dVal = 200.0;
		String strVal2 = dVal + "";  // int -> String ��ȯ �� �ٸ� ���
		
		double sum = Integer.parseInt("+" + strVal);
	}
}
