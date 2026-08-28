import java.util.*;

public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {

        Integer[] indexes = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) ->
            Integer.compare(heights[b], heights[a])
        );

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[indexes[i]];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        String[] result = sortPeople(names, heights);

        for (String name : result) {
            System.out.print(name + " ");
        }

        sc.close();
    }
}