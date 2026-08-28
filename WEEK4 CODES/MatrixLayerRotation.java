import java.util.*;

public class MatrixLayerRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int layer = 0; layer < Math.min(m, n) / 2; layer++) {
            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);

            for (int i = top + 1; i <= bottom; i++)
                list.add(matrix[i][right]);

            for (int i = right - 1; i >= left; i--)
                list.add(matrix[bottom][i]);

            for (int i = bottom - 1; i > top; i--)
                list.add(matrix[i][left]);

            int size = list.size();
            int shift = r % size;

            int index = shift;

            for (int i = left; i <= right; i++) {
                matrix[top][i] = list.get(index);
                index = (index + 1) % size;
            }

            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = list.get(index);
                index = (index + 1) % size;
            }

            for (int i = right - 1; i >= left; i--) {
                matrix[bottom][i] = list.get(index);
                index = (index + 1) % size;
            }

            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = list.get(index);
                index = (index + 1) % size;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}