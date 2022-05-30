package Exception;

import java.io.File;

public class Ex08_declareException {
	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일 생성 완료");
		} catch(Exception e) {
			System.out.println(e.getMessage() + " 다시 입력해 주세요.");
		}
	}
	
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다.");
		File f = new File(fileName);	// 파일 클래스 객체 생성
		// File 객체의 createNewFile 메서드를 이용해 실제 파일 생성
		return f;	// 생성된 객체 참조 반환
	}
}