package OOP;

public class Ex01_overloading {
	public static void main(String[] args) {
		
		MyMath01 mm = new MyMath01();
		
		System.out.println("mm.add(7, 7) ���: " + mm.add(3, 3));
		System.out.println();
		
		System.out.println("mm.add(7L, 7) ���: " + mm.add(3L, 3));
		System.out.println();
		
		System.out.println("mm.add(7, 7L) ���: " + mm.add(3, 3L));
		System.out.println();
		
		System.out.println("mm.add(7L, 7L) ���: " + mm.add(3L, 3L));
		System.out.println();
		
		int[] a = {100, 200, 300};
		
		System.out.println("mm.add(a) ���: " + mm.add(a));
	}
}

class MyMath01 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {  // �迭�� ��� ��� ���� ��ȯ
		System.out.print("int add(int[] a) - ");
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}
}