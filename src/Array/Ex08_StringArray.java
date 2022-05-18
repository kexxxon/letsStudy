package Array;
import java.util.Arrays;

public class Ex08_StringArray {
	public static void main(String[] args) {
		
		// index: 0~2
		String[] strArr = {"가위", "바위", "보"};
				System.out.println(Arrays.toString(strArr));
		
		for(int i = 0; i < 10; i++) {
			// System.out.println((int)(Math.random() * 3)); // 0~2
			
			// 변수에 담기
			int tmp = (int)(Math.random() * 3);
			System.out.println(strArr[tmp]);
		}
	}
}
