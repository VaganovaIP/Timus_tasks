package Tasks;

import java.util.Scanner;

public class Easy_to_crack_1404 {
    public  static int decode(int y, int of) {
        int x = (y - 5 - of + 26) % 26;
        return x < 0 ? (x + 26) : x;
    }
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        String st = InCMD.nextLine();
        int of = 0;
        for (int i=0; i<st.length(); i++) {
            int cur = decode(st.charAt(i) - 'a', of);
            System.out.printf("%c", cur+'a');
            of+=cur;
        }
    }
}
