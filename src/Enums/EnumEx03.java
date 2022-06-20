package Enums;

enum Transportation {
	BUS(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	
	TRAIN(150) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	
	SHIP(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	
	AIRPLANE(300) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	};
	
	protected final int BASIC_FARE;	// protected로 해야 각 상수에서 접근 가능
	
	Transportation(int basicFare) {	// private Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}
	
	public int getBasicFare() {
		return BASIC_FARE;
	}
	
	abstract int fare(int distance);	// 거리에 따른 요금 계산
}

public class EnumEx03 {
	public static void main(String[] args) {
		System.out.println("Bus fare: " + Transportation.BUS.fare(100));
		System.out.println("Train fare: " + Transportation.TRAIN.fare(100));
		System.out.println("Ship fare: " + Transportation.SHIP.fare(100));
		System.out.println("Airplane fare: " + Transportation.AIRPLANE.fare(100));
	}
}
