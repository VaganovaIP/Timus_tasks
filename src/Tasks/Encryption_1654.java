package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Encryption_1654 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        String st = InCMD.nextLine();
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i = 0; i < st.length(); i++) {
            char cur = st.charAt(i);
            int len = result.size();
            if (len != 0 && cur == result.get(len - 1)) {
                result.remove(len - 1);
            } else {
                result.add(cur);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }
}
