package Flow;

public class FlowEx12_break {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		
//		while(sum <= 100) {
//			++i;
//			sum += i;
//		}
		
		// break;
		while(true) {
			if(sum > 100)
			break;
			
			++i;
			sum += i;
		}
		
		System.out.println("i: " + i);
		System.out.println("sum: " + sum);
	}
}
