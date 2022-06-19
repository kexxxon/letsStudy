package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		// �� �߰� - add()
		al.add("A"); al.add("B");
		al.add("D"); al.add("E");
		
		System.out.println(al);  // [A, B, D, E]

		// Ư�� index�� �� �߰� - add(index, Eelement)
		al.add(2, "C");
		System.out.println(al);  // [A, B, C, D, E]
		
		// �� ���� - set()
		al.set(1, "b");
		System.out.println(al);  // [A, b, C, D, E]

		// �� ���� - remove(), clear()
		al.remove(1);	// ù��° ��� ����
		System.out.println(al);  // [A, C, D, E]
		
		al.remove("D");	// D ����
		System.out.println(al);  // [A, C, E]
		
		// �� �б�
		System.out.println(al.get(0));  // A
		System.out.println(al.get(1));  // C
		System.out.println(al.get(2));  // E
		
		// ��ü ����
		al.clear();
		System.out.println(al);  // []
	}
}
