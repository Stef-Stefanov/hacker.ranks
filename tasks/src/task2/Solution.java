package task2;

import java.util.Scanner;

/**
 * Task
 * In this challenge, you must read integers from stdin
 * and then print them to stdout. Each integer must be
 * printed on a new line. To make the problem a little
 * easier, a portion of the code is provided for you in
 * the editor below.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();

        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}

