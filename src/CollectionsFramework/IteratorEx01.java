package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// list 블록 + 우클릭 > Refactor > Rename - 관련 한번에 다 바뀜 
		
		// HashSet도 가능 - Set이 Collection 자손이라서 Iterator 사용 가능
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
		
		// --- 또 읽고 싶을 때
		// iterator는 1회용이라 다 쓰면 다시 얻어와야됨
		it = list.iterator();	// 새로운 iterator 객체 생성
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator 대신 for문으로 변경
		// HashSet에는 get 메서드가 없어서 HashSet에서는 아래 코드 동작하지 않음
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
