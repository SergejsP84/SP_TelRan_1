package Lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SubarrayZero {

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(3, 11)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-15, 16);
        }
        System.out.println("Lo and behold, and never doubt the arrayness of this magnificent array");
        System.out.println(Arrays.toString(array));
        if (hasZero(array)) {
            System.out.println("The array contains a zero, so the condition is met by default");
        } else if (!hasBothPossAndNegs(array)) {
            System.out.println("This array has no zeroes and not a single positive (or negative) number.");
            System.out.println("Thus, the answer is a NAY - no subarrays totaling to a zero here.");
        } else if (findZeroingSubarrays(array)) {
            System.out.println("This array does have the honour of containing subarrays," +
                    " the elements of which graciously total to a perfect zero");
        } else System.out.println("Bad luck - no subarrays meeting the condition in this generated array");
    }
    public static boolean hasZero (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return true;
        }
        return false;
    }
    public static boolean hasBothPossAndNegs (int[] array) {
        boolean hasPositive = false;
        boolean hasNegative = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) hasNegative = true;
            if (array[i] > 0) hasPositive = true;
        }
        return (hasNegative && hasPositive);
    }
    public static boolean findZeroingSubarrays (int[] array) {
        boolean anythingFound = false;
        for (int start = 0; start < array.length; start++) {
            int sum = 0;
            for (int end = start; end < array.length; end++) {
                sum += array[end];
                if (sum == 0) {
                    System.out.println("Found a subarray that sums to zero: " +
                            Arrays.toString(Arrays.copyOfRange(array, start, end + 1)));
                    anythingFound = true;
                }
            }
        }
        return anythingFound;
    }
}
