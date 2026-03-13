import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N < 2) {
            System.out.println(-1);
            return;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if (x < first) {
                second = first;
                first = x;
            } else if (x > first && x < second) {
                second = x;
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
    }
}