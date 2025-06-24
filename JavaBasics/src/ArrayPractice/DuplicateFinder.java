package ArrayPractice;
import java.util.HashSet;

public class DuplicateFinder {

    // Method to find duplicates in an integer array
    public static void findIntegerDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) { // If already seen, it's a duplicate
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate integers: " + duplicates);
    }

    // Method to find duplicates in a string array
    public static void findStringDuplicates(String[] array) {
    	
    	//String strr = "Aravindhan Ravi";
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String str : array) {
            if (!seen.add(str)) { // If already seen, it's a duplicate
                duplicates.add(str);
            }
        }

        System.out.println("Duplicate strings: " + duplicates);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 2, 4, 5, 1};
        String[] stringArray = {"apple", "banana", "apple", "cherry", "banana"};

        findIntegerDuplicates(intArray);
        findStringDuplicates(stringArray);
    }
}
