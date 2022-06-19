package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);	// HashSet�� objArr ��ҵ� ����
			System.out.println(objArr[i] + ": " + set.add(objArr[i]));4
			// set�� ��ä�迭 ��� �� �߰��ϸ鼭 ����
		}
		System.out.println();
		
		// HashSet�� ����� ��ҵ� ���
		System.out.println(set);
		System.out.println();
		
		// HashSet�� ����� ��ҵ� ��� - Iterator �̿�
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
