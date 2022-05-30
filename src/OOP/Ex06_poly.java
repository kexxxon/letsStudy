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
	
	// 물건 별 메서드
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
	
	// 매개변수 타입이 Product인 메서드 하나로 모든 물건 구매 가능
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
