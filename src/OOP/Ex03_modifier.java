package OOP;

class MyParent {
	private   int prv;  // ���� Ŭ����
			  int dft;	// ���� ��Ű��
	protected int prt; 	// ���� ��Ű�� + �ٸ� ��Ű�� �ڼ�
	public	  int pub;	// �������Ѿ���
	
	public void printMembers() {
		System.out.println(prv);  // ok
		System.out.println(dft);  // ok
		System.out.println(prt);  // ok
		System.out.println(pub);  // ok
	}
}


public class Ex03_modifier {
	public static void main(String[] args) {
		MyParent p = new MyParent();
		
//		System.out.println(p.prv);  // error
		System.out.println(p.dft);  // ok
		System.out.println(p.prt);  // ok
		System.out.println(p.pub);  // ok
	}                                
}
