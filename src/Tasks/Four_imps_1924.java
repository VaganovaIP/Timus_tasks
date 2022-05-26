package Tasks;

import java.util.Scanner;

public class Four_imps_1924 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        long n = InCMD.nextLong();
        if (n%4 == 1 || n%4 == 2) {
            System.out.print("grimy\n");
        } else {
            System.out.print("black\n");
        }
    }
}
