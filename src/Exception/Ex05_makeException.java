package Exception;

public class Ex05_makeException {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e; // ���ܸ� �߻���Ŵ
			
			// throw new Exception("���Ƿ� �߻���Ŵ"); // �� ������ ���ٷ�
			
		} catch(Exception e) {
			System.out.println("����: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}
}
