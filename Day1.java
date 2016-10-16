import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

 /* Declare second integer, double, and String variables. */
        int integ;
        double num;
        String str;

        /* Read and save an integer, double, and String to your variables.*/
        integ = scan.nextInt();
        num = scan.nextDouble();
        str = scan.next();
        str += scan.nextLine(); // scan.next() only outputs "is", need this concatenation to append to next line

        /* Print the sum of both integer variables on a new line. */
        i = i + integ;
        System.out.println(i);
        /* Print the sum of the double variables on a new line. */
        d = d + num;
        System.out.println(d);		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String combo = s.concat(str);
        System.out.println(combo);		

        scan.close();
    }
}
