package task3;

import java.io.*;

/**
 * Task
 * In this challenge, you must read integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line. To make the problem a little easier,
 * a portion of the code is provided for you in the editor below.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (n % 2 != 0) {

            System.out.println("Weird");

        } else {
            if (n>=2 && n<=5) {
                System.out.println("Not Weird");
            }
            if (n>=6 && n<=20) {
                System.out.println("Weird");
            }
            if (n>20) {
                System.out.println("Not Weird");
            }
        }
    }
}
