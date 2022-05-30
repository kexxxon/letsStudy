package OOP;
abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����");
	}
}

// �������̽��� ��� �޼���� �տ� public abstract ����
interface Fightable {
	void move(int x, int y);
	void attck(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
	// �������̵� ��Ģ: ����(public)���� ���������ڰ� ������ �ȵ�
	// public �Ⱥ��̸� default�ϱ� ������ ���Ƽ� public �ٿ���ߵ�
	public void move(int x, int y) { 
		System.out.println("[" + x + ", " + y + "]�� �̵�");
	}
	
	public void attck(Fightable f) {
		System.out.println(f + "�� ����");
	}
	
	// �ο� �� �ִ� ��븦 �θ���
	Fightable getFightable() {
		Fighter f = new Fighter(); // Fighter ���� �� ��ȯ
		return f;
	}
}


public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
	}
}
