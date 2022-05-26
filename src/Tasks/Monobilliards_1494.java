package Tasks;

import java.util.Scanner;

public class Monobilliards_1494 {
        public static void main(String[] args) {
            Scanner InCMD = new Scanner(System.in);
            int n = InCMD.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = InCMD.nextInt();
            }
            boolean flag = true;
            int pos = 0, pos2 = 0, sz = 0;

            while (flag && pos < n)
                if (sz > 0 && arr2[sz - 1] == arr[pos])
                {
                    sz=sz-1;
                    pos=pos+1;
                    break;
                }
                else if (pos2 < n)
                {
                    arr[sz] = pos2 +1;
                    sz++;
                }
                else flag = false;
            if (flag){
                System.out.println("Not a proof");
            } else {
                System.out.println("Cheater");
            }

        }
}
