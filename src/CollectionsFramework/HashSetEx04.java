package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx04 {
	public static void main(String[] args) {
		HashSet setA   = new HashSet();
		HashSet setB   = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3"); 
		setA.add("4"); setA.add("5"); 
		System.out.println("A: " + setA);
		
		setB.add("4"); setB.add("5"); setB.add("6"); 
		setB.add("7"); setB.add("8"); 
		System.out.println("B: " + setB);
		
//		Iterator it = setB.iterator();
//		while(it.hasNext()) {
//			Object tmp = it.next();
//			if(setA.contains(tmp))
//				setKyo.add(tmp);
//		}
		
		// 교집합
		setA.retainAll(setB);	// 공통 요소만 남기고 삭제
		System.out.println("교집합: " + setB);
		
		// 합집합
		setA.addAll(setB);		// setB의 모든 요소 추가(중복 제외)
		System.out.println("합집합: " + setB);
		
		// 차집합
		setA.removeAll(setB);	// setB와 공통 요소 제거
		System.out.println("차집합: " + setB);
		
//		it = setA.iterator();
//		while(it.hasNext()) {
//			Object tmp = it.next();
//		if(!setB.contains(tmp))
//			setCha.add(tmp);
//		}
//
//		it = setA.iterator();
//		while(it.hasNext())
//			setHab.add(it.next());
//		
//		it = setB.iterator();
//		while(it.hasNext())
//			setHab.add(it.next());
		
		System.out.println("A ∩ B: " + setKyo);
		System.out.println("A ∪ B: " + setHab);
		System.out.println("A - B: " + setCha);
	}
}
