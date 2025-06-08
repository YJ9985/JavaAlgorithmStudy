import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxValue = arr[0][0];
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(maxValue);
        System.out.println((maxI + 1) + " " + (maxJ + 1));
    }
}
