import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev = 0;
        while (N != 0) {
            rev = rev * 10 + N % 10;
            N /= 10;
        }
        System.out.println(rev);
    }
}