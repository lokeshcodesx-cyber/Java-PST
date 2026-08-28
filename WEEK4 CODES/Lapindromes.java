import java.util.*;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            String left = s.substring(0, n / 2);
            String right;

            if (n % 2 == 0)
                right = s.substring(n / 2);
            else
                right = s.substring(n / 2 + 1);

            int[] count = new int[26];

            for (char c : left.toCharArray())
                count[c - 'a']++;

            for (char c : right.toCharArray())
                count[c - 'a']--;

            boolean lapindrome = true;

            for (int x : count) {
                if (x != 0) {
                    lapindrome = false;
                    break;
                }
            }

            System.out.println(lapindrome ? "YES" : "NO");
        }
        sc.close();
    }
}