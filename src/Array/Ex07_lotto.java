package Array;
import java.util.Arrays;

public class Ex07_lotto {
	public static void main(String[] args) {
		
		// index 범위: 0~44
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열
		
		// 배열 각 욧오에 1~45 값 저장
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // ball[0]에 1부터 저장됨
		}
		
		int tmp = 0; // 두 값을 바꾸는 데 사용할 임시변수
		int j = 0;	 // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 저장
		// 0~5 요소까지 6개만 변경
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0~44 범위의 임이의 값 얻기
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			
			System.out.println(Arrays.toString(ball));
		}
		
		// 배열 ball 앞에서부터 6개 요소 출력
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]: %d%n", i, ball[i]);
		}
	}
}
