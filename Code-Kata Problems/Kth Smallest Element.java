import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        if (K > set.size()) {
            System.out.println(-1);
            return;
        }

        int count = 1;
        for (int num : set) {
            if (count == K) {
                System.out.println(num);
                return;
            }
            count++;
        }
    }
}