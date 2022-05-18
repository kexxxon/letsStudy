package Array;
import java.util.Scanner;

public class Ex12_2DArray03 {
	public static void main(String[] args) {
		
		String[][] words = {
				{"Array", "배열"},    // words[0][0], words[0][1]
				{"Variable", "변수"}, // words[1][0], words[1][1]
				{"Integer", "정수"}   // words[2][0], words[2][1]
		};
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = s.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);
			}
		}
	}
}
