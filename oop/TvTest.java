package oop;

class Tv {
    String color;
    boolean power;
    int channel;

    void power()       { power = !power; }
    void channelUp()   { ++channel; }
    void channelDown() { --channel; }
}

public class TvTest {
    public static void main(String[] args) {
        /* TvTest 01 */
        Tv tv01 = new Tv();

        tv01.channel = 7;
        tv01.channelUp();
        System.out.printf("tv01의 값: %d번%n", tv01.channel);

        System.out.println();

        /* TvTest 02 */
        Tv tv02 = new Tv();
        Tv tv03 = new Tv();
        System.out.printf("tv02의 값: %d%n", tv02.channel);
        System.out.printf("tv03의 값: %d%n", tv03.channel);

        tv02.channel = 7;
        System.out.printf("tv02의 값을 %d로 변경%n", tv02.channel);

        tv03.channel = 1;
        System.out.printf("tv03의 값을 %d로 변경%n", tv03.channel);

        System.out.printf("tv02의 채널: %d%n", tv02.channel);
        System.out.printf("tv03의 채널: %d%n", tv03.channel);

        System.out.println();

        /* TvTest 03 */
        Tv tv04 = new Tv();
        Tv tv05 = new Tv();
        System.out.printf("tv04의 값: %d%n", tv04.channel);
        System.out.printf("tv05의 값: %d%n", tv05.channel);

        tv05 = tv04;
        tv04.channel = 7;
        System.out.printf("tv05의 값을 %d로 변경%n", tv04.channel);

        System.out.printf("tv04의 채널: %d%n", tv04.channel);
        System.out.printf("tv04의 채널: %d%n", tv05.channel);

        System.out.println();

        /* TvTest 04 */
        Tv[] tvArr = new Tv[3];

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
        }
    }
}