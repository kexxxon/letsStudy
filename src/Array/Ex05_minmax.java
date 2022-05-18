package Array;

public class Ex05_minmax {
	public static void main(String[] args) {
		int[] score = {57, 62, 100, 31, 79, 24, 83};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
 		
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}
}
