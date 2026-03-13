import java.util.*;

public class FrequencyCounter {
    
    public static <T> void countFrequency(List<T> list) {
        Map<T, Integer> frequencyMap = new LinkedHashMap<>();
        
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        
        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] elements = sc.nextLine().split(" ");
        
        // Try to parse as integers first, fallback to strings
        List<Integer> intList = new ArrayList<>();
        boolean isInt = true;
        
        for (String el : elements) {
            try {
                intList.add(Integer.parseInt(el));
            } catch (NumberFormatException e) {
                isInt = false;
                break;
            }
        }
        
        if (isInt) {
            countFrequency(intList);
        } else {
            List<String> strList = Arrays.asList(elements);
            countFrequency(strList);
        }
        
        sc.close();
    }
}
