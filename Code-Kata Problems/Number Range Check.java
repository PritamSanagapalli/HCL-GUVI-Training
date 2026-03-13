import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);
        if (N >= L && N <= R) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}