package Flow;
import java.util.Scanner;

public class FlowEx14_break_comtinue {

	public static void main(String[] args) {
		
		int menu, num = 0;
		
		Scanner s = new Scanner(System.in);
		
		outer:  // while���� outer��� �̸� ����
		while(true) {
			System.out.println("���ϴ� �޴��� �����ϼ���. *����: 0");
			System.out.println("1. Square");
			System.out.println("2. Square Root");
			System.out.println("3. Log");
			
//			menu = Integer.parseInt(s.nextLine());
			String tmp = s.nextLine();    // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			menu = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
			
			if(menu == 0) {
//				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. *����: 0");
				continue;
			}
			

			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
			
			for(;;) { // ���ѹݺ���
				System.out.println("����� ���� �Է��ϼ���. *��� ����: 0, ��ü ����: 99");
				
				tmp = s.nextLine();    		 // ȭ�鿡�� �Է¹��� ������ tmp�� ����
				num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
				
				if(num == 0)
					break;	// ��� ����. for�� ������
				
				if(num == 99)
					break outer;
				
				switch(menu) {
				case 1:
					System.out.println("result: " + num * num);
					break;
				case 2:
					System.out.println("result: " + Math.sqrt(num));
					break;
				case 3:
					System.out.println("result: " + Math.log(num));
					break;
				}
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
