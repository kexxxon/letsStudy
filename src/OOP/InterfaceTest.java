package OOP;
class A {
//	public void method(B b) {  
	public void method(I i) {  // 인터페이스 I를 구현한 것들만 들어와
		i.method();
	}
}

// B클래스의 선언과 구현을 분리
interface I {
	// method() 선언
	public void method();
}

class B implements I {
	// method() 구현
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
//		a.method(new B()); // A가 B를 사용(의존)
//		a.method(new C()); // A가 C를 사용(의존)
		// A가 B대신 C를 사용하려면 class A의 매개변수를 수정해야 함
		// A가 변경이 없게 하려면 B를 분리해야 함
		
		a.method(new B());
		
		// C가 인터페이스 I를 구현하면 method()의 매개변수로 가능
		a.method(new C());
	}
}
