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

class MyMath { 	// 메서드는 클래스 영역에만 정의 가능
	// Prac01. 연산
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
	
	// Prac02. 두 값 중 큰 값을 반환하는 메서드 작성
	long max(long a, long b) {
		long result = 0;
		
//		if(a > b) {
//			return a;  // 조건식이 참일 때 실행
//		} else {
//			return b;  // 조건식이 거짓일 때 실행
//		}
		
		// 3항 연산자
//		result = a > b ? a : b;
//		return result;
		
		// 3항 연산자 1줄로
		return a > b ? a : b;
	}
	
	// Prac03. 두 값 중 작은 값을 반환하는 메서드 작성
	long min(long a, long b) {
		long result = 0;
		return a > b ? b : a;
	}
	
	// Prac04. 반환 값 없는 void
	void print99dan(int dan) {
		
		if(!(2 <= dan && dan <= 9)) {
			return; // 입력받은 dan이 2~9 사이가 아니면 메서드 종료 후 리턴
		}
		
		for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		
//		return; // 생략 가능
	}
}

