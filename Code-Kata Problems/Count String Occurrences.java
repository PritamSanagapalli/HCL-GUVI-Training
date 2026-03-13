import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= sentence.length() - s.length(); i++) {
            int j = 0;

            while (j < s.length() && sentence.charAt(i + j) == s.charAt(j)) {
                j++;
            }

            if (j == s.length()) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}