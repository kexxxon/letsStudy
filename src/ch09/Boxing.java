package ch09;

import java.util.ArrayList;

public class Boxing {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);				// JDK1.5 �������� ����
		list.add(new Integer(100));	// list�� ��ü�� �߰� ����
		
//		Integer i = list.get(0);	// list�� ����� ù���� ��ü ����
//		int i = list.get(0).intValue();	// intValue()�� Integer -> int ��ȯ
		int i = list.get(0);	// intValue()�� Integer -> int ��ȯ
	}
}
