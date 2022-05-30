package OOP;

public class Ex04_cast {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		fe1.water();
		car = fe1; // car = (Car)fe1;에서 형변환 생략
//		car.water(); // error - Car 타입 참조변수인 car로 water() 사용 불가
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car1 {
	String color;
	int door;
	
	void drive() {	// 운전하는 기능
		System.out.println("drive");
	}
	
	void stop() {	// 멈추는 기능
		System.out.println("stop");
	}
}

class FireEngine extends Car1 {	// 소방차
	void water() {	// 물 뿌리는 기능
		System.out.println("water");
	}
}