package ch08;

import java.io.File;

public class ExceptionEx16 {
	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일 생성 성공적");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해주세요.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("유효하지 않은 파일 이름");
		
		File f = new File(fileName);
		
		// File 객체의 createNewFile 메서드를 이용해서 실제 파일 생성
		f.createNewFile();
		return f;
	}
}