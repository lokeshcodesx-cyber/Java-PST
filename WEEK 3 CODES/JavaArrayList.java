import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("ArrayList: " + list);

        System.out.println("Elements:");

        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}