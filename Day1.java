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

        int integ;
        double num;
        String str;

        integ = scan.nextInt();
        num = scan.nextDouble();
        str = scan.next();
        str += scan.nextLine(); 

        i = i + integ;
        System.out.println(i);
        d = d + num;
        System.out.println(d);		
	    
        String combo = s.concat(str);
        System.out.println(combo);		

        scan.close();
    }
}
