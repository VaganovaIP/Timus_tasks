package Tasks;

import java.util.Scanner;

public class Strange_Dialogue_1102 {
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuffer  s = new StringBuffer();
        int i;
        input.nextLine();
        for (i = 0; i < n; i++) {
            s.append(input.nextLine());
            System.out.println(s.reverse().toString().replaceAll("eno|notup|tupni|tuptuo|tuo|ni", "").isEmpty() ? "YES"
                    : "NO");
            s.delete(0,s.length());
        }

    }
}
