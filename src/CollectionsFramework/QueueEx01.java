package CollectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx01 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	// Queue�� �ִ� 5�������� ����
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� ����");
		
		while(true) {
			System.out.print(">> ");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help: ����");
					System.out.println(" q �Ǵ� Q: ���α׷� ����");
					System.out.println(" history: �ֱ� �Է��� ��ɾ� " + MAX_SIZE + "�� ������");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);	// �Է¹��� ��ɾ� ����
					
					LinkedList tmp = (LinkedList)q;	// LinkedList ���� �����ֱ�
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("����: " + e.getMessage());
			}
		}
	}
	
	public static void save(String input) {
		// queue�� ����
		if(!"".equals(input))
			q.offer(input);
		
		// queue�� �ִ� ũ�⸦ ������ ���� ó�� �Էµ� ���� ����
		if(q.size() > MAX_SIZE) // size()�� Collection�������̽����� ����
			q.remove();
	}
}
