package OOP;
//class Marine {
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
//	void stimPack() {}
//}
//
//class Tank {
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
//	void changeMode() {}
//}
//
//class Dropship {
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
//	void load() {}
//	void unload() {}
//}

// 위에서 공통 부분 추출해서 Unit 추상클래스 만듦
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

// move 호출 시 상속받은 유닛의 move 호출됨

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine [x: " + x + ", y: " + y + "]");
	}
	void changeMode() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank [x: " + x + ", y: " + y + "]");
	}
	void stimPack() {}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship [x: " + x + ", y: " + y + "]");
	}
	void load() {}
	void unload() {}
}


public class Ex07_abstract {
	public static void main(String[] args) {
		
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		// 위 4줄 한줄로
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
}
