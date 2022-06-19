package CollectionsFramework;

import java.util.HashSet;

public class HashSetEx03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");	// 중복이라 저장 안됨
		set.add(new Person2("June", 6));
		set.add(new Person2("June", 6));
		
		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	public String toString() {
		return name + ": " + age;
	}
}