package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);	// HashSet에 objArr 요소들 저장
			System.out.println(objArr[i] + ": " + set.add(objArr[i]));4
			// set에 객채배열 요소 값 추가하면서 찍음
		}
		System.out.println();
		
		// HashSet에 저장된 요소들 출력
		System.out.println(set);
		System.out.println();
		
		// HashSet에 저장된 요소들 출력 - Iterator 이용
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
