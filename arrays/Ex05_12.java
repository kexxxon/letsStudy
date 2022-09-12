package arrays;

public class Ex05_12 {
    public static void main(String[] args) {
        String[] names = {"Son", "Kim", "Lee"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]: " + names[i]);
        }

        // store 3rd element of names Array in tmp
        String tmp = names[2];
        System.out.println("tmp: " + tmp);
        names[0] = "Choi";

        for(String nameEle : names) {
            System.out.println(nameEle);
        }
    }
}
