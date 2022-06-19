package CollectionsFramework;

import java.util.List;

public class MyVector implements List {
	Object[] data = null;	// 객체 담을 객체배열 선언
	int capacity = 0;		// 용량
	int size = 0;			// 크기
	
	public MyVector(int capacity) {
		if(capacity < 0) 
			throw new IllegalArgumentException("유효하지 않은 값: " + capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);	// 크기 지정 안하면 10으로 함
	}
	
	// 최소한의 저장공간(capacity) 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	public boolean add(Object obj) {
		// 새로운 객체 저장 전 저장공간 확보
		ensureCapacity(size + 1);
		data[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어남");
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어남");
		oldObj = data[index];
		
		// 삭제하려고 하는 객체가 마지막이 아니면, 배열복사를 통해 빈자리를 채워줌
		if(index != size - 1) {
			System.arraycopy(data, index + 1, data, index, size - index - 1);
		}
		
		// 마지막 데이터를 null로 함. 배열은 0부터 시작하므로 마지막 요소는 index가 size - 1
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
		if(this.capacity == capacity) return;	// 크기가 같으면 변경 안함
		
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
