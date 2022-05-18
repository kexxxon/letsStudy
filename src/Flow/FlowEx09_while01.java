package Flow;

public class FlowEx09_while01 {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		
		// i 를 1씩 증가시켜 sum에 계속 더함
		while(sum <= 100) {
			System.out.printf("%d: %d%n", i, sum);
			sum += ++i;
		}
	}
}
