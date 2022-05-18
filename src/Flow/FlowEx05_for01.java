package Flow;

public class FlowEx05_for01 {

	public static void main(String[] args) {
		// for(초기화; 조건식; 증감식) { 수행할 문장 }
	 //	for(int i = 1; i <= 5; i++) {
	 //		System.out.println(i);
	 //	}
		
		// ',' 이용해서 변수 2개 쓰기 (변수 타입 동일해야됨)
		for(int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + ", j=" + j);
		}
	}
}
 