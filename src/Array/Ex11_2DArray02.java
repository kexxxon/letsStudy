package Array;

public class Ex11_2DArray02 {
	public static void main(String[] args) {
		
		int[][] score = {
				{70, 80, 80},
				{80, 90, 90},
				{80, 80, 90},
				{90, 90, 100},
				{60, 100 ,50}
		};
		
		int korTTL = 0, engTTL = 0, mathTTL = 0;  // °ú¸ñ º° ÃÑÁ¡
		
		System.out.println(" ¹øÈ£  ±¹¾î  ¿µ¾î  ¼öÇÐ  ÃÑÁ¡   Æò±Õ");
		System.out.println("-----------------------------");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;		// °³ÀÎ º° ÃÑÁ¡
			float avg = 0.0f;	// °³ÀÎ º° Æò±Õ
			
			korTTL += score[i][0];
			engTTL += score[i][1];
			mathTTL += score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j  = 0; j < score[i].length; j++) {
				sum += score[i][j];	// °³ÀÎ º° ÇÕ°è
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum / (float)score[i].length; // °³ÀÎ º° Æò±Õ
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("-----------------------------");
		System.out.printf("ÃÑÁ¡:  %3d %4d %4d%n", korTTL, engTTL, mathTTL);
	}
}
