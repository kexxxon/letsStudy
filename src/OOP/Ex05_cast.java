package OOP;

public class Ex05_cast {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine fe3 = null;
		
	}
}

class Car2 {
	String color;
	int door;
	
	void drive() {	// �����ϴ� ���
		System.out.println("drive");
	}
	
	void stop() {	// ���ߴ� ���
		System.out.println("stop");
	}
}

class FireEngine3 extends Car2 {	// �ҹ���
	void water() {	// �� �Ѹ��� ���
		System.out.println("water");
	}
}