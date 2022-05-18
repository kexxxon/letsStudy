package Array;
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 길이가 5인 int 배열 선언 & 초기화
		int[] iArr = {65, 75, 85, 95, 100};
		
		// System.out.println(iArr); // [I@515f550a
		
		// 배열 요소 출력
		// 방법 1. 반복문
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}

		// 방법 2. Arrays.toString 메서드 사용
		System.out.println(Arrays.toString(iArr)); // [65, 75, 85, 95, 100]
		// Arrays메서드: 배열의 내용을 문자열로 만들어서 반환
	}
}
