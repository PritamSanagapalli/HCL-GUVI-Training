import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		boolean found = false;
		StringBuilder sb = new StringBuilder();
		for (char c : N.toCharArray()) {
			if ((c - '0') % 2 == 1) {
				sb.append(c).append(" ");
				found = true;
			}
		}
		if (found) {
			System.out.println(sb.toString().trim());
		} else {
			System.out.println("-1");
		}
	}
}
