import java.util.*;
import java.util.stream.*;

public class StreamAPISquareFilter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}

		List<Integer> result = numbers.stream()
			.map(x -> x * x)
			.filter(x -> x % 3 == 0)
			.collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}
