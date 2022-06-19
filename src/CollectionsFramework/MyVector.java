package CollectionsFramework;

import java.util.List;

public class MyVector implements List {
	Object[] data = null;	// ��ü ���� ��ü�迭 ����
	int capacity = 0;		// �뷮
	int size = 0;			// ũ��
	
	public MyVector(int capacity) {
		if(capacity < 0) 
			throw new IllegalArgumentException("��ȿ���� ���� ��: " + capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);	// ũ�� ���� ���ϸ� 10���� ��
	}
	
	// �ּ����� �������(capacity) Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	public boolean add(Object obj) {
		// ���ο� ��ü ���� �� ������� Ȯ��
		ensureCapacity(size + 1);
		data[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ���");
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ���");
		oldObj = data[index];
		
		// �����Ϸ��� �ϴ� ��ü�� �������� �ƴϸ�, �迭���縦 ���� ���ڸ��� ä����
		if(index != size - 1) {
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}
		
		// ������ �����͸� null�� ��. �迭�� 0���� �����ϹǷ� ������ ��Ҵ� index�� size - 1
		data[size - 1] = null;
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i = 0; i < size; i ++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) return;	// ũ�Ⱑ ������ ���� ����
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i = 0; i < size; i++)
			data[i] = null;
		size = 0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean isEmpty() {return size == 0;}
	public int capacity() {return capacity;}
	public int size() {return size;}
}
