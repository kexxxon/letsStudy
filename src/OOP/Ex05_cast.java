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
	
	void drive() {	// 운전하는 기능
		System.out.println("drive");
	}
	
	void stop() {	// 멈추는 기능
		System.out.println("stop");
	}
}

class FireEngine3 extends Car2 {	// 소방차
	void water() {	// 물 뿌리는 기능
		System.out.println("water");
	}
}