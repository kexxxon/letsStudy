package CollectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		// set 크기가 6보다 작은 동안 1~45 사이의 난수 저장
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num); // = set.add(new Integer(num));
		}
		
		System.out.println(set);	// 정렬 안됨
		
		// 정렬하려면: set의 모든 요소를 list로 저장 -> list를 정렬 -> list 출력
		List list = new LinkedList(set);	// = LinkedList(Collection c)
		Collections.sort(list);				// = Collections.sort(List list)
		System.out.println(list);
		
	}
}
