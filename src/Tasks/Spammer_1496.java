package Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Spammer_1496 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int n = InCMD.nextInt();
        String[] akk = new String[n];
        InCMD.nextLine();
        for (int i = 0; i < n; i++) {
            akk[i] = InCMD.nextLine();
        }
        Arrays.sort(akk);
        HashSet<String> spam = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++)
                if(akk[i].equals(akk[j])){
                    spam.add(akk[i]);
                }
        }
        for (String i :spam)
            System.out.println(i);
    }
}
