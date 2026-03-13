import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean hasVowel = false;
		for (char c : s.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
				hasVowel = true;
				break;
			}
		}
		System.out.println(hasVowel ? "yes" : "no");
	}
}
