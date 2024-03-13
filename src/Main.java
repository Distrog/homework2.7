import java.util.*;

public class Main {
    public static void main(String[] args) {
        printOddNumbers(new ArrayList<Integer>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        printEvenNumbersInAscendingOrder(new ArrayList<Integer>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        printUniqueWords(new ArrayList<String>(List.of("one", "two", "three", "four", "one", "five", "six", "five")));
        printNumberOfDuplicates(new ArrayList<>(List.of("один", "два", "два", "три", "три", "три")));
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumbersInAscendingOrder(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> setNums = new LinkedHashSet<>(nums);
        for (Integer num : setNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printUniqueWords(List<String> strings) {
        System.out.println(new HashSet<String>(strings));
    }

    public static void printNumberOfDuplicates(List<String> strings) {
        Map<String, Integer> numbersMap = new LinkedHashMap<>();
        for (String string : strings) {
            if (numbersMap.containsKey(string)) {
                int number = numbersMap.get(string);
                numbersMap.put(string, ++number);
            } else {
                numbersMap.put(string, 1);
            }
        }
        System.out.println(numbersMap.values());
    }
}