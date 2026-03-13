import java.util.*;

public class CreatingFrequencyMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // consume newline
		String[] words = sc.nextLine().split(" ");

		Map<String, Integer> freqMap = new LinkedHashMap<>();
		for (String word : words) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
