import java.util.*;

class MaxFinder<T extends Comparable<T>> {
	public T findMax(List<T> list) {
		if (list == null || list.isEmpty()) {
			throw new IllegalArgumentException("List is empty or null");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}

public class GenericsDemo {
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
			MaxFinder<Integer> finder = new MaxFinder<>();
			System.out.println("Maximum: " + finder.findMax(intList));
		} else if (isDouble) {
			MaxFinder<Double> finder = new MaxFinder<>();
			System.out.println("Maximum: " + finder.findMax(doubleList));
		} else {
			List<String> strList = Arrays.asList(elements);
			MaxFinder<String> finder = new MaxFinder<>();
			System.out.println("Maximum: " + finder.findMax(strList));
		}
	}
}
