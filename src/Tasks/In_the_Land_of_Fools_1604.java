package Tasks;

import java.util.Scanner;

public class In_the_Land_of_Fools_1604 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int k = InCMD.nextInt();
        int[] nk = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            nk[i] = InCMD.nextInt();
            sum += nk[i];
        }
        int last_index = -1;
        int max_index;
        for (int i = 0; i < sum; i++){
            max_index = 0;
            if(last_index == 0) max_index = 1;
            for (int j = 1; j < k; j++){
                if(last_index != j && nk[j] >= nk[max_index])
                    max_index = j;
            }
            if (nk[max_index] == 0)
                max_index = last_index;
            nk[max_index] -= 1;
            last_index = max_index;
            System.out.print(max_index+1+" ");
        }
    }

}
