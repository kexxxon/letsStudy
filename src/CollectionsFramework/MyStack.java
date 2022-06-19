package CollectionsFramework;

import java.util.Vector;
import java.util.EmptyStackException;

public class MyStack extends Vector {
	public Object push(Object item) {
		addElement(item);
		return item;
		
	}
	
	public Object pop() {
		Object obj = peek();
		// 만약 Stack이 비어있으면 peek() 메서드가 EmptyStackException 발생
		
		// 마지막 요소 삭제. 배열 index가 0부터 시작하므로 1을 빼줌
		removeElementAt(size() - 1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0) 
			throw new EmptyStackException();
		
		// 마지막 요소 반환. 배열 index가 0부터 시작하므로 1 빼줌
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);	// 끝에서부터 객체 찾음. 반환값은 저장된 위치(배열의 index)
		
		if(i >= 0) {	// 객체를 찾은 경우
			return size() -1;	// Stack은 맨 위에 저장된 객체의 index를 1로 정의 -> 계산으로 구함
		}
		
		return - 1;	// 해당 객체 못찾으면 -1 반환
	}
}
