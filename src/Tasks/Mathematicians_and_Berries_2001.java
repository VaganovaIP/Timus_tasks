package Tasks;

import java.util.Scanner;

public class Mathematicians_and_Berries_2001 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = InCMD.nextInt();
            B[i] = InCMD.nextInt();
        }
        System.out.printf("%d %d", A[0] - A[2], B[0] - B[1]);
    }

}
