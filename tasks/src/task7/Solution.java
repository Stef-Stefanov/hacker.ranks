package task7;

import java.util.*;

/**
 * <a href="https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true">task link</a>
 *
 */
public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append(getResult(a, b, j)).append(" ");
            }
            System.out.println(stringBuilder);
        }
        in.close();
    }

    private static int getResult(int a, int b, int j) {
        int result = a;
        for (int k = 0; k <= j; k++) {
            result += (int) ((Math.pow(2,k))* b);
        }
        return result;
    }
}
