import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // first term (a)
        int B = sc.nextInt(); // common difference (d)
        int C = sc.nextInt(); // number of terms (n)
        int sum = (C * (2 * A + (C - 1) * B)) / 2;
        System.out.println(sum);
    }
}