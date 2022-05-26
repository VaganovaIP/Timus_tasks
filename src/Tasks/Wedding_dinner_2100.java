package Tasks;

import java.util.Scanner;

public class Wedding_dinner_2100 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int n = InCMD.nextInt();
        String[] friends = new String[n];
        InCMD.nextLine();
        for(int i = 0;i < n;i++){
            friends[i] = InCMD.nextLine();
        }
        int count_person = 2;
        for(int i = 0;i < n;i++){
            if(friends[i].contains("+one")) {
                    count_person += 2;
            }
            else count_person += 1;
        }
        if(count_person == 13) count_person++;
        System.out.print(count_person*100);
    }
}
