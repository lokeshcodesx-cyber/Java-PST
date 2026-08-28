import java.util.PriorityQueue;
import java.util.Scanner;

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}