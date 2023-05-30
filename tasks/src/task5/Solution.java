package task5;

import java.util.*;

/**
 * task link:
 * <a href="https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true">...</a>
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int index=0;index<3;index++) {
            String a=sc.next();
            String b=sc.next();
            StringBuilder stringBuilder = new StringBuilder();
            if (b.length()<3){
                stringBuilder.append("0".repeat(3 - b.length()));
                stringBuilder.append(b);
                b = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder(a);
            for (int j = a.length(); j < 15; j++) {
                stringBuilder.append(" ");
            }
            a = stringBuilder.toString();
            System.out.println(a+b);
        }
        System.out.println("================================");

    }
}

