package OOP;

public class Ex04_cast {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		fe1.water();
		car = fe1; // car = (Car)fe1;���� ����ȯ ����
//		car.water(); // error - Car Ÿ�� ���������� car�� water() ��� �Ұ�
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� <- ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
	}
}

class Car1 {
	String color;
	int door;
	
	void drive() {	// �����ϴ� ���
		System.out.println("drive");
	}
	
	void stop() {	// ���ߴ� ���
		System.out.println("stop");
	}
}

class FireEngine extends Car1 {	// �ҹ���
	void water() {	// �� �Ѹ��� ���
		System.out.println("water");
	}
}