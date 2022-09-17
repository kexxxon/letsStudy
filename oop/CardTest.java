package oop;

class Card {
    String kind;
    int number;
    static int width = 200;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card card1 = new Card();
        card1.kind = "Heart";
        card1.number = 7;

        Card card2 = new Card();
        card2.kind = "Clover";
        card2.number = 4;

        System.out.printf("card1 = %s, %d, 크기 = (%d, %d)%n",
                card1.kind, card1.number, card1.width, card1.height);
        System.out.printf("card2 = %s, %d, 크기 = (%d, %d)%n",
                card2.kind, card2.number, card2.width, card2.height);

        System.out.println("card1의 width와 height를 각각 100, 150으로 변경");
        card1.width = 100;
        card1.height = 150;

        System.out.printf("card1 = %s, %d, 크기 = (%d, %d)%n",
                card1.kind, card1.number, card1.width, card1.height);
        System.out.printf("card2 = %s, %d, 크기 = (%d, %d)%n",
                card2.kind, card2.number, card2.width, card2.height);

        /*
            class variables c1 and c2 always have the same value
            because they refer to the same storage space
         */
    }
}
