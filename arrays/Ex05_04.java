package arrays;

import java.util.Arrays;

public class Ex05_04 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C'};
        char[] num = {'1', '2', '3', '4', '5'};

//        System.out.println(abc); // ABC
//        System.out.println(num); // 12345
//        System.out.println(Arrays.toString(abc)); // [A, B, C]
//        System.out.println(Arrays.toString(num)); // [1, 2, 3, 4, 5]

        // 배열 abc와 num의 길이를 합친 배열 만들기
        char[] abcNum = new char[abc.length + num.length];

        System.arraycopy(abc, 0, abcNum, 0, abc.length);
        System.out.println(Arrays.toString(abcNum)); // [A, B, C, null, null, null, null, null]

        System.arraycopy(num, 0, abcNum, abc.length, num.length);
        System.out.println(Arrays.toString(abcNum)); // [A, B, C, 1, 2, 3, 4, 5]

        // 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(Arrays.toString(num)); // [A, B, C, 4, 5]

        // num의 인덱스2 위치에 abc를 복사
        System.arraycopy(abc, 0, num, 2, abc.length);
        System.out.println(Arrays.toString(num)); // [A, B, A, B, C]
    }
}