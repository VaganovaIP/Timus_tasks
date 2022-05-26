package Tasks;

import java.util.Scanner;

public class Sandros_book_1723 {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int l = s.length();
        int  max = 0;
        char zak= 0;
        for (int i = 0; i < l; i++) {
            char sym = s.charAt(i);
            int count = 1;
            for (int j = i+1; j < l; j++) {
                if (s.charAt(j) == sym) count++;
            }
            if (count > max) {
                max = count;
                zak = s.charAt(i);
            }

        }
        System.out.print(zak);
    }
}
