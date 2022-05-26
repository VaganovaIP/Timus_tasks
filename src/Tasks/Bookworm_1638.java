package Tasks;

import java.util.Scanner;

public class Bookworm_1638 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int t_not = InCMD.nextInt();
        int t_all = InCMD.nextInt();
        int tom_s = InCMD.nextInt();
        int tom_f = InCMD.nextInt();
        if (tom_f > tom_s)
        {
            int len = (tom_f - tom_s-1) * (2 * t_all + t_not) + 2 * t_all;
            System.out.print(len);
        }
        else System.out.print((tom_s - tom_f)*(t_all+t_all+t_not)+t_not);


    }
}
