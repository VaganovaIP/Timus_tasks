package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Magnetic_storms_1126 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        int m = InCMD.nextInt();
        int[] m_data = new int[25001];
        int pr=0, i = 0;
        while(pr != -1){
            int mp = InCMD.nextInt();
            if(mp != -1){
                m_data[i] = mp;
                i++;
            } else break;
        }
        int kol = i + 1;
        int max = m_data[0];
        int j =0;
        while (j < kol) {
            if (m_data[j] > max)
                max = m_data[j];
        }

        for(i = 0; i < kol; i++){

        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean flag = false;
        while (flag==true){
            int p = InCMD.nextInt();
            if(p == -1){
               flag = false;
            }else{
                arr.add(p);
            }
        }
        //for(int i = 0; i < arr.size();i++){
            //if ()
        //}
    }
}
