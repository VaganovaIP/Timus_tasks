package Tasks;

import java.util.Scanner;

public class Stairs_1017 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int n = InCMD.nextInt();
        n++;
        if ((n >= 5) && (n <= 500)) {
            int[][] Stairs = new int[n][n];
            for (int i = 0; i < n; i++) {
                Stairs[i] = new int[n];
                for (int j = 0; j < n; j++) {
                    Stairs[i][j] = 0;
                }
            }
            for (int i = 0; i < n; i++) {
                Stairs[0][i] = 0;
                Stairs[i][0] = 0;
                Stairs[i][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < i; j++) {
                    Stairs[i][j] = Stairs[i - 1][j - 1] + Stairs[i - j][j - 1];
                }
            }
            int result = 0;
            for (int i = 0; i < n; i++) {
                result += Stairs[n - 1][i];
            }
            System.out.print(result-1);
        }
    }
}
