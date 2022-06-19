package ch08;

import java.io.File;

public class ExceptionEx15 {
	public static void main(String[] args) {
		// command line���� �Է¹��� ���� �̸����� ���� ���� ����
		File f = createFile(args[0]);
		System.out.println(f.getName() + " ���� ���� ������");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("��ȿ���� ���� ���� �̸�");
		} catch (Exception e) {
			// fileName�� �������� ���, ���� �̸��� '�������.txt'�� ��
			fileName = "�������.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch(Exception e) {}
	}
}
