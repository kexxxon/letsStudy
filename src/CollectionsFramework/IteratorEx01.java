package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// list ��� + ��Ŭ�� > Refactor > Rename - ���� �ѹ��� �� �ٲ� 
		
		// HashSet�� ���� - Set�� Collection �ڼ��̶� Iterator ��� ����
//		HashSet list = new HashSet(); 
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// --- �� �а� ���� ��
		// iterator�� 1ȸ���̶� �� ���� �ٽ� ���;ߵ�
		it = list.iterator();	// ���ο� iterator ��ü ����
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator ��� for������ ����
		// HashSet���� get �޼��尡 ��� HashSet������ �Ʒ� �ڵ� �������� ����
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
