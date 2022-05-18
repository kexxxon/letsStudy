package Array;
import java.util.Arrays;

public class Ex14_Arrays {

	public static void main(String[] args) {
		
		// �迭 ���
		int [] arr = {0, 1, 2, 3, 4}; // 1���� �迭
		int [][] arr2D = {{11, 12}, {21, 22}}; // 2���� �迭
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		// ���ڿ� ��
		String[][] str2D  = {{"aa", "bb"}, {"AA", "BB"}};
		String[][] str2D2 = {{"aa", "bb"}, {"AA", "BB"}};
		
		//System.out.println(str2D == str2D2); // �������� �� ��
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		// �迭 ����
		int[] arr2 = Arrays.copyOf(arr, arr.length); // �迭 arr �����ؼ� arr2 �����
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr, 7); // �迭 arr���� ū ���� ����
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOfRange(arr, 2, 4); // from ~ to 
		System.out.println(Arrays.toString(arr4));
		
		// �迭 ����
		int [] arr5 = {1, 5, 3, 2, 4};
		System.out.println(Arrays.toString(arr5)); // ���� ��
		Arrays.sort(arr5); // ��������
		System.out.println(Arrays.toString(arr5)); // ���� ��
	}
}
