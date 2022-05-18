package Array;

public class Ex01 {

	public static void main(String[] args) {
//		int[] score; 		// 1. 배열 score(참조변수) 선언
//		score = new int[5]; // 2. 배열 생성(int 저장공간 x 5)
		
		int[] score = new int[5]; // 배열의 선언과 생성
		
		score[3] = 100;
		
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("score[3]: " + score[3]);
		System.out.println("score[4]: " + score[4]);
		
		int value = score[3];
		System.out.println("value: " + value);
	}
}
