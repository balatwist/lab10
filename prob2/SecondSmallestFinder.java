package prob2;

import java.util.List;

public class SecondSmallestFinder {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }

        T smallest = list.get(0);
        T secondSmallest = list.get(1);

        if (smallest.compareTo(secondSmallest) > 0) {
            T temp = smallest;
            smallest = secondSmallest;
            secondSmallest = temp;
        }

        for (int i = 2; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current.compareTo(secondSmallest) < 0 && !current.equals(smallest)) {
                secondSmallest = current;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        // Example usage with integers
        List<Integer> intList = List.of(5, 3, 8, 2, 7);
        Integer secondSmallestInt = secondSmallest(intList);
        System.out.println("Second Smallest Integer: " + secondSmallestInt);

        // Example usage with strings
        List<String> strList = List.of("apple", "orange", "banana", "kiwi");
        String secondSmallestStr = secondSmallest(strList);
        System.out.println("Second Smallest String: " + secondSmallestStr);
    }
}
