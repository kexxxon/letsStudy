package arrays;

public class Ex05_19 {
    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 100},
                {70, 80, 90},
                {60, 70, 80},
                {100, 90, 80},
                {90, 70, 80}
        };

        int korTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;

        System.out.println(" 번호 국어  영어  수학  총점  평균");
        System.out.println("-".repeat(30));

        for(int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0;

            korTotal  += score[i][0];
            engTotal  += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1);

            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float)score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("-".repeat(30));
        System.out.printf("총점: %2d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}
