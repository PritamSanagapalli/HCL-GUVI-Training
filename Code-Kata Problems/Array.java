import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> students = new ArrayList<>();
		students.add("Rahul");
		students.add("Anita");
		students.add("John");
		students.add("Priya");
		students.add("David");

		System.out.println("All Students: " + students);
		System.out.println("Student at index 2: " + students.get(2));
	}
}
