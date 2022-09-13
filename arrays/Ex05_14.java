package arrays;

public class Ex05_14 {
    public static void main(String[] args) {
        String str = "JAVA";

        for(int i = 0; i < str.length(); i++) {
            // store char i of str in ch
            char ch = str.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }

        // String to char[]
        char[] chArr = str.toCharArray();
        System.out.println(chArr);
    }
}
