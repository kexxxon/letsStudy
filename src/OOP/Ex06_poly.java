package OOP;
class Product {
	int price;
	int bonusPoint;
}

class TV extends Product {}
class Computer extends Product {}
class Audio extends Product {}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	// ���� �� �޼���
//	void buy(TV t) {
//		money =+ t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		money =+ c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		money =+ a.price;
//		bonusPoint += a.bonusPoint;
//	}
	
	// �Ű����� Ÿ���� Product�� �޼��� �ϳ��� ��� ���� ���� ����
	void buy(Product p) {
		money += p.price;
		bonusPoint += bonusPoint;
	}
}

public class Ex06_poly {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		TV tv = new TV();
		Computer com = new Computer();
		
		b.buy(tv);
		b.buy(com);
	}
}
