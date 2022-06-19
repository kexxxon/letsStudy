
public class ConstructorThis {
	private String name;
	private int age;
	
	public ConstructorThis() {
		this("이름없음");	// this를 이용해서 JavaThis(String name) 생성자 호출
		System.out.println("JavaThis() 생성자 호출 완료");
	}
	
	public ConstructorThis(String name) {
		this(name, 100);	// this를 이용해서 JavaThis(String name, int age) 생성자 호출
		System.out.println("JavaThis(String name) 생성자 호출 완료");
	}
	
	public ConstructorThis(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name: " + name + ", age: " + age);
		System.out.println("JavaThis(String name, int age) 생성자 호출 완료");
	}
	
	public static void main(String[] args) {
		ConstructorThis ct = new ConstructorThis();
	}
}
