package Tasks;

import java.util.Scanner;

public class Degree_1110 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int n = InCMD.nextInt();
        int m = InCMD.nextInt();
        int y = InCMD.nextInt();
        int test=1;
        boolean x = false;
        for (int i = 0; i < m; i++) {
            test=1;
            for (int j = 0; j < n; j++) {
                test = (test*(i%m))%m;
            }
            if (test == y) {
                System.out.print(i + " ");
                x = true;
            }
        }
        if (!x)
            System.out.print("-1");
    }
}
