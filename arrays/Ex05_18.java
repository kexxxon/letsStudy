package arrays;

public class Ex05_18 {
    public static void main(String[] args) {
        int[][] number = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for(int i = 0; i < number.length; i++)
            for(int j = 0; j < number[i].length; j++)
                System.out.printf("number[%d][%d] = %d%n", i, j, number[i][j]);

        for(int[] numEle : number)
            for(int i : numEle)
                sum += i;

        System.out.println("sum = " + sum);
    }
}

