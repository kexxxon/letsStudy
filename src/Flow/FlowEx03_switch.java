package Flow;
import java.util.Scanner;

public class FlowEx03_switch {

	public static void main(String[] args) {
		System.out.print("Enter the current Month> ");
		
		Scanner s = new Scanner(System.in);
		int month = s.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� month�� ����
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("Spring it is!");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer it is!");
			break;
		case 9: case 10: case 11:
			System.out.println("Autumn it is!");
			break;
		default:
			//	case 12: case 1: case 2:
			System.out.println("Winter it is!");
		}
	}
}
