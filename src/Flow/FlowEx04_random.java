package Flow;

public class FlowEx04_random {
	public static void main(String[] args) {
		
		// {} 안의 내용을 10번 반복
		for(int i = 1; i <= 10; i++) {
			
			// 기본 Math.random 난수 10개 출력
		 	System.out.println(Math.random()); // 0.0 <= x < 1.0
			
			// Q1. 1~10 사이 난수 10개 출력
		 //	System.out.println(Math.random() * 10); // 0.0 <= x < 10.0
	 	 //	System.out.println((int)(Math.random() * 10)); // 0 <= x < 10, 0~9
		 // System.out.println((int)(Math.random() * 10) + 1); // 1 <= x < 11,1~10
			
			
			// Q2.-5~5 사이 난수 10개 출력
			// (-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 / 총 11개)
		 // System.out.println((int)(Math.random() * 11)); // 0 <= x < 11, 0~10
		 // System.out.println((int)(Math.random() * 11) -5); // -5 <= x < 6, -5~5
		}
	}
} 
