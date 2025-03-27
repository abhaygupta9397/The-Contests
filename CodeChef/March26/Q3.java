import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int n = sc.nextInt();
            int k = sc.nextInt();

            int old[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                old[i] = sc.nextInt();
            }

            int real[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                real[i] = sc.nextInt();
            }

            boolean ans[] = new boolean[1];
            ans[0] = false;

            int min_move = 0;
            int s_star = 9;
            for (int i = 0; i < n; i++) {
                int d = Math.abs(real[i] - old[i]);
                min_move += Math.min(d, 9 - d);

                s_star = Math.min(s_star, Math.max(d, 9 - d) - Math.min(d, 9 - d));
            }

            if (k >= min_move) {
                int d = k - min_move;
                if (d % 2 == 0 || d >= s_star){
                    ans[0] = true;
                } else {
                    ans[0] = false;
                }
            } else {
                ans[0] = false;
            }


            if (ans[0])
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }

    }

}