package OOP;
class MyPoint01 extends Object {
	int x;
	int y;
	
	// 생성자
	MyPoint01(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
}


public class OverridingTest02 {
	public static void main(String[] args) {
		MyPoint01 p = new MyPoint01(1, 7);
		
//		p.x = 3;
//		p.y = 5;
		
//		System.out.println("p.x: " + p.x);
//		System.out.println("p.y: " + p.y);
		
//		System.out.println(p.toString());
		
		System.out.println(p);
	}
}
