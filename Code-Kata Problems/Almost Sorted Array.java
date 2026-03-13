import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0, index = -1;
        for (int i = 1; i < N; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                index = i - 1;
            }
        }
        if (count == 1) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
    }
}