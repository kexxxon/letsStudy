package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		// 값 추가 - add()
		al.add("A"); al.add("B");
		al.add("D"); al.add("E");
		
		System.out.println(al);  // [A, B, D, E]

		// 특정 index에 값 추가 - add(index, Eelement)
		al.add(2, "C");
		System.out.println(al);  // [A, B, C, D, E]
		
		// 값 변경 - set()
		al.set(1, "b");
		System.out.println(al);  // [A, b, C, D, E]

		// 값 삭제 - remove(), clear()
		al.remove(1);	// 첫번째 요소 삭제
		System.out.println(al);  // [A, C, D, E]
		
		al.remove("D");	// D 삭제
		System.out.println(al);  // [A, C, E]
		
		// 값 읽기
		System.out.println(al.get(0));  // A
		System.out.println(al.get(1));  // C
		System.out.println(al.get(2));  // E
		
		// 전체 삭제
		al.clear();
		System.out.println(al);  // []
	}
}
