package OOP;
class A {
//	public void method(B b) {  
	public void method(I i) {  // �������̽� I�� ������ �͵鸸 ����
		i.method();
	}
}

// BŬ������ ����� ������ �и�
interface I {
	// method() ����
	public void method();
}

class B implements I {
	// method() ����
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
//		a.method(new B()); // A�� B�� ���(����)
//		a.method(new C()); // A�� C�� ���(����)
		// A�� B��� C�� ����Ϸ��� class A�� �Ű������� �����ؾ� ��
		// A�� ������ ���� �Ϸ��� B�� �и��ؾ� ��
		
		a.method(new B());
		
		// C�� �������̽� I�� �����ϸ� method()�� �Ű������� ����
		a.method(new C());
	}
}
