import java.util.*;

public class TheMaximumSubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubArray = arr.get(0);
        int currentSum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubArray = Math.max(maxSubArray, currentSum);
        }

        int maxSubSequence = 0;
        int largest = arr.get(0);

        for (int num : arr) {
            if (num > 0) {
                maxSubSequence += num;
            }

            largest = Math.max(largest, num);
        }

        if (maxSubSequence == 0) {
            maxSubSequence = largest;
        }

        return Arrays.asList(maxSubArray, maxSubSequence);
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        System.out.println(maxSubarray(arr));
    }
}