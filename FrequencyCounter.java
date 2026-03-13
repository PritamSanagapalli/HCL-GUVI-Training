import java.util.*;

/**
 * FrequencyCounter - A generic utility to count element frequencies in a list
 * Uses HashMap to efficiently track and display frequency counts
 */
public class FrequencyCounter {
    
    /**
     * Generic method to count frequency of elements in a list
     * @param <T> Generic type parameter (must be a valid HashMap key type)
     * @param list List of elements to count
     */
    public static <T> void countFrequency(List<T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        
        // LinkedHashMap maintains insertion order for consistent output
        Map<T, Integer> frequencyMap = new LinkedHashMap<>();
        
        // Count frequency of each element
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        
        // Display results in format: element -> frequency
        for (Map.Entry<T, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    /**
     * Main method to process input and invoke frequency counter
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read number of elements
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline after integer
            
            // Validate input
            if (n <= 0) {
                return;
            }
            
            // Read all elements as a single line
            String line = sc.nextLine().trim();
            String[] elements = line.split("\\s+");
            
            // Verify element count matches expected
            if (elements.length != n) {
                n = elements.length; // Adjust if mismatch
            }
            
            // Attempt to parse all elements as integers
            List<Integer> intList = new ArrayList<>(n);
            boolean allIntegers = true;
            
            for (String element : elements) {
                try {
                    intList.add(Integer.parseInt(element));
                } catch (NumberFormatException e) {
                    allIntegers = false;
                    break;
                }
            }
            
            // Process as integers or strings based on content
            if (allIntegers && !intList.isEmpty()) {
                countFrequency(intList);
            } else {
                List<String> strList = new ArrayList<>(Arrays.asList(elements));
                countFrequency(strList);
            }
            
        } catch (Exception e) {
            // Handle any unexpected errors gracefully
            System.err.println("Error processing input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
