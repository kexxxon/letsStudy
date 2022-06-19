import static java.util.Collections.addAll;
import static java.util.Collections.binarySearch;
import static java.util.Collections.copy;
import static java.util.Collections.disjoint;
import static java.util.Collections.enumeration;
import static java.util.Collections.fill;
import static java.util.Collections.list;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.nCopies;
import static java.util.Collections.replaceAll;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.rotate;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;
import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class CollectionsEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);
		
		rotate(list, 2);	// ���������� �� ĭ�� �̵�
		System.out.println(list);
		
		swap(list, 0, 2);	// ù��°�� ����°�� ��ȯ
		System.out.println(list);
		
		shuffle(list);		// ����� ��� ��ġ�� ���Ƿ� ����
		System.out.println(list);
		
		sort(list, reverseOrder());	// ���� ���� reverse(list);�� ����
		System.out.println(list);
		
		sort(list);		// ����
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	// 3�� ����� ��ġ(index) ��ȯ
		System.out.println("index of 3: " + idx);
		
		System.out.println("max: " + max(list));
		System.out.println("min: " + min(list));
		System.out.println("min: " + max(list, reverseOrder()));
		
		fill(list, 9);
		System.out.println("list: " + list);
		
		// list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ���� �Ұ�
		List newList = nCopies(list.size(), 2);
		System.out.println("newList: " + newList);
		
		System.out.println(disjoint(list, newList));
		
		copy(list, newList);
		System.out.println("newList: " + newList);
		System.out.println("list: " + list);
		
		replaceAll(list, 2, 1);
		System.out.println("list: " + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2: " + list2);
	}
}
