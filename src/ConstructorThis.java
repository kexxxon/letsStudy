
public class ConstructorThis {
	private String name;
	private int age;
	
	public ConstructorThis() {
		this("�̸�����");	// this�� �̿��ؼ� JavaThis(String name) ������ ȣ��
		System.out.println("JavaThis() ������ ȣ�� �Ϸ�");
	}
	
	public ConstructorThis(String name) {
		this(name, 100);	// this�� �̿��ؼ� JavaThis(String name, int age) ������ ȣ��
		System.out.println("JavaThis(String name) ������ ȣ�� �Ϸ�");
	}
	
	public ConstructorThis(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name: " + name + ", age: " + age);
		System.out.println("JavaThis(String name, int age) ������ ȣ�� �Ϸ�");
	}
	
	public static void main(String[] args) {
		ConstructorThis ct = new ConstructorThis();
	}
}
