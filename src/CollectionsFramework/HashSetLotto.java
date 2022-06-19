package CollectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		// set ũ�Ⱑ 6���� ���� ���� 1~45 ������ ���� ����
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num); // = set.add(new Integer(num));
		}
		
		System.out.println(set);	// ���� �ȵ�
		
		// �����Ϸ���: set�� ��� ��Ҹ� list�� ���� -> list�� ���� -> list ���
		List list = new LinkedList(set);	// = LinkedList(Collection c)
		Collections.sort(list);				// = Collections.sort(List list)
		System.out.println(list);
		
	}
}
