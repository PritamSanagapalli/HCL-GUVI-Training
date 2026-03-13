import java.util.*;

public class CollectionsSortDemo {
	public static <T extends Comparable<T>> void sortList(List<T> list) {
		Collections.sort(list);
		for (T item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // consume newline
		String[] elements = sc.nextLine().split(" ");

		// Try to parse as Integer, Double, or fallback to String
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		boolean isInt = true, isDouble = true;
		for (String el : elements) {
			try {
				intList.add(Integer.parseInt(el));
			} catch (NumberFormatException e) {
				isInt = false;
			}
			try {
				doubleList.add(Double.parseDouble(el));
			} catch (NumberFormatException e) {
				isDouble = false;
			}
		}

		if (isInt) {
			sortList(intList);
		} else if (isDouble) {
			sortList(doubleList);
		} else {
			List<String> strList = Arrays.asList(elements);
			sortList(strList);
		}
	}
}
