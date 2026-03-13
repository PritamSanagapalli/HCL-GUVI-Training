import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		if (len == 1) {
			System.out.println("*");
		} else if (len % 2 == 1) {
			int mid = len / 2;
			System.out.println(s.substring(0, mid) + "*" + s.substring(mid + 1));
		} else {
			int mid1 = len / 2 - 1;
			int mid2 = len / 2;
			System.out.println(s.substring(0, mid1) + "**" + s.substring(mid2 + 1));
		}
	}
}
