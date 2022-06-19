package ch09;

import java.util.ArrayList;

public class Boxing {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);				// JDK1.5 이전에는 에러
		list.add(new Integer(100));	// list는 객체만 추가 가능
		
//		Integer i = list.get(0);	// list에 저장된 첫번재 객체 꺼냄
//		int i = list.get(0).intValue();	// intValue()로 Integer -> int 변환
		int i = list.get(0);	// intValue()로 Integer -> int 변환
	}
}
