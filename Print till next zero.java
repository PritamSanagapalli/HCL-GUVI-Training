import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int first = -1, second = -1;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                    break;
                }
            }
        }

        if (first == -1 || second == -1 || second - first <= 1) {
            System.out.println(-1);
            return;
        }

        for (int i = first + 1; i < second; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}