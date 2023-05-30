package task4;

import java.util.*;
import java.text.DecimalFormat;

public class Solution {
    /**
     * full task: link<a href="https://www.hackerrank.com/challenges/java-stdin-stdout/problem">...</a>
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number = Integer.parseInt(sc.nextLine());
        double floatingNumber = Double.parseDouble(sc.nextLine());
        String string = sc.nextLine();
        System.out.println("String: " + string);
        DecimalFormat decimalFormat = new DecimalFormat("#.0###");
        System.out.println("Double: " + floatingNumber);
        System.out.println("Int: " + number);
    }
}
