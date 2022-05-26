package Tasks;

import java.util.Scanner;

public class One_step_away_from_happiness_1493 {
    public static int Sum (int n)
    {
        int res = n % 10;
        n /= 10;
        res += n % 10 + n / 10;
        return res;
    }
    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);
        int ticket = input.nextInt();
        int part1 = (ticket + 1)/1000;
        int part2 = (ticket + 1)%1000;
        int part11 = (ticket - 1)/1000;
        int part22 = (ticket - 1)%1000;
        part1 = Sum(part1);
        part2 = Sum(part2);
        part11 = Sum(part11);
        part22 = Sum(part22);
        if((part1 == part2) || (part11 == part22)){
            System.out.print("Yes");
        } else System.out.print("No");
    }
}
