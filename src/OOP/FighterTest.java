package OOP;
abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춤");
	}
}

// 인터페이스의 모든 메서드는 앞에 public abstract 생략
interface Fightable {
	void move(int x, int y);
	void attck(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙: 조상(public)보다 접근제어자가 좁으면 안됨
	// public 안붙이면 default니까 범위가 낮아서 public 붙여줘야됨
	public void move(int x, int y) { 
		System.out.println("[" + x + ", " + y + "]로 이동");
	}
	
	public void attck(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	// 싸울 수 있는 상대를 부르기
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter 생성 후 반환
		return f;
	}
}


public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
	}
}
