package Array;

public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;	// 총점을 저장하기 위한 변수
		float avg = 0f; // 평균을 저장하기 위한 변수
		
		int[] score = {95, 100, 93, 100, 98};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float)score.length; // 계산 결과를 flaot로 얻기 위해 형변환
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
}
