package Tasks;

import java.util.Scanner;

public class Bicycle_codes_1877 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int z1 = InCMD.nextInt();
        int z2 = InCMD.nextInt();

        if (z1%2==0 || z2%2==1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
