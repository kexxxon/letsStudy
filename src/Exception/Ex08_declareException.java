package Exception;

import java.io.File;

public class Ex08_declareException {
	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "���� ���� �Ϸ�");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " �ٽ� �Է��� �ּ���.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);	// ���� Ŭ���� ��ü ����
		// File ��ü�� createNewFile �޼��带 �̿��� ���� ���� ����
		return f;	// ������ ��ü ���� ��ȯ
	}
}