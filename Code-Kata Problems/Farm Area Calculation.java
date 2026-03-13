import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double L = sc.nextDouble();
		double B = sc.nextDouble();
		double area = L * B;
		System.out.printf("%.5f\n", area);
	}
}
