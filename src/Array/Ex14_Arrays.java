package Array;
import java.util.Arrays;

public class Ex14_Arrays {

	public static void main(String[] args) {
		
		// 배열 출력
		int [] arr = {0, 1, 2, 3, 4}; // 1차원 배열
		int [][] arr2D = {{11, 12}, {21, 22}}; // 2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		// 문자열 비교
		String[][] str2D  = {{"aa", "bb"}, {"AA", "BB"}};
		String[][] str2D2 = {{"aa", "bb"}, {"AA", "BB"}};
		
		//System.out.println(str2D == str2D2); // 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// 배열 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length); // 배열 arr 복사해서 arr2 만들기
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, 7); // 배열 arr보다 큰 길이 복사
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // from ~ to 
		System.out.println(Arrays.toString(arr4));
		
		// 배열 정렬
		int [] arr5 = {1, 5, 3, 2, 4};
		System.out.println(Arrays.toString(arr5)); // 정렬 전
		Arrays.sort(arr5); // 오름차순
		System.out.println(Arrays.toString(arr5)); // 정렬 후
	}
}
