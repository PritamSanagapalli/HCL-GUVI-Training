import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int i = 0;

        while (true) {
            if (i >= s1.length() || i >= s2.length()) break;

            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("no");
                return;
            }
            i++;
        }

        if (s1.length() == s2.length()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}