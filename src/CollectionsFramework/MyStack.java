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
		// ���� Stack�� ��������� peek() �޼��尡 EmptyStackException �߻�
		
		// ������ ��� ����. �迭 index�� 0���� �����ϹǷ� 1�� ����
		removeElementAt(size() - 1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0) 
			throw new EmptyStackException();
		
		// ������ ��� ��ȯ. �迭 index�� 0���� �����ϹǷ� 1 ����
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);	// ���������� ��ü ã��. ��ȯ���� ����� ��ġ(�迭�� index)
		
		if(i >= 0) {	// ��ü�� ã�� ���
			return size() -1;	// Stack�� �� ���� ����� ��ü�� index�� 1�� ���� -> ������� ����
		}
		
		return - 1;	// �ش� ��ü ��ã���� -1 ��ȯ
	}
}
