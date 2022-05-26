package Tasks;

import java.util.Scanner;

public class Wizard_1370 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int N = InCMD.nextInt();
        int M = InCMD.nextInt();
        int[] arr = new int[N];
        for (int i=0; i < N; i++)
            arr[i]=InCMD.nextInt();
        for (int i = M%N, j=0; j < 10; i++,j++) {
            if(i >= N) i=0;
            System.out.print(arr[i]);
        }
    }
}
