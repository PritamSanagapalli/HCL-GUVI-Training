import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long minFactor = 1;
		
		// Find the highest power of 2 that divides N
		// All powers of 2 must be in the factor to make quotient odd
		while (n % 2 == 0) {
			minFactor *= 2;
			n /= 2;
		}
		
		System.out.println(minFactor);
	}
}
