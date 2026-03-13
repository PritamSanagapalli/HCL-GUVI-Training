import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        long sum = k * (k + 1) / 2;

        System.out.println(sum);
    }
}