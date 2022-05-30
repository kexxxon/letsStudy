package OOP;
class Point {
	int x;
	int y;
}

//상속
//class Circle extends Point {
//	int r;
//}

// 포함
class Circle {
	Point p = new Point(); // 참조변수 초기화
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		// 상속
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
		
//		System.out.println("c.x: " + c.x);
//		System.out.println("c.y: " + c.y);
//		System.out.println("c.r: " + c.r);
		
		// 포함
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		System.out.println("c.p.x: " + c.p.x);
		System.out.println("c.p.y: " + c.p.y);
		System.out.println("c.r: " + c.r);
	}
}
