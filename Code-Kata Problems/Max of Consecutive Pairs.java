import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N - 1; i++){
            int max = Math.max(arr[i], arr[i + 1]);
            System.out.print(max + " ");
        }
    }
}