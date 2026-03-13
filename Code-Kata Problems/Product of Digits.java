import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long product = 1;
        for (char c : N.toCharArray()) {
            product *= (c - '0');
        }
        System.out.println(product);
    }
}