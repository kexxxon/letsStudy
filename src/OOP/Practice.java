package OOP;

public class Practice {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
				
		// Prac01
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5, 3) = " + result1);
		System.out.println("substract(5, 3) = " + result2);
		System.out.println("multiply(5, 3) = " + result3);
		System.out.println("divide(5, 3) = " + result4);
		
		// Prac02~03		
		long result5 = mm.max(5, 3);
		long result6 = mm.min(5, 3);
		
		System.out.println("max(5, 3) = " + result5);
		System.out.println("min(5, 3) = " + result6);
		
		// Prac04
		mm.print99dan(3);
	}
}

class MyMath { 	// �޼���� Ŭ���� �������� ���� ����
	// Prac01. ����
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long substract(long a, long b) {
		return a - b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
	
	// Prac02. �� �� �� ū ���� ��ȯ�ϴ� �޼��� �ۼ�
	long max(long a, long b) {
		long result = 0;
		
//		if(a > b) {
//			return a;  // ���ǽ��� ���� �� ����
//		} else {
//			return b;  // ���ǽ��� ������ �� ����
//		}
		
		// 3�� ������
//		result = a > b ? a : b;
//		return result;
		
		// 3�� ������ 1�ٷ�
		return a > b ? a : b;
	}
	
	// Prac03. �� �� �� ���� ���� ��ȯ�ϴ� �޼��� �ۼ�
	long min(long a, long b) {
		long result = 0;
		return a > b ? b : a;
	}
	
	// Prac04. ��ȯ �� ���� void
	void print99dan(int dan) {
		
		if(!(2 <= dan && dan <= 9)) {
			return; // �Է¹��� dan�� 2~9 ���̰� �ƴϸ� �޼��� ���� �� ����
		}
		
		for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		
//		return; // ���� ����
	}
}

