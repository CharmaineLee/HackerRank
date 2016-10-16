import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void printLetters(char [] letters) {
        for (int i = 0; i < letters.length; i += 2) {
             System.out.print(letters[i]);
        }
    System.out.print(" ");
    
        for (int j = 1; j < letters.length; j += 2) {
            System.out.print(letters[j]);
        }
    System.out.println();
}

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
          int T = scan.nextInt();
          scan.nextLine();
           for(int i=1; i<= T; i++) {
                  String str = scan.nextLine();
                  printLetters(str.toCharArray());
            }
    }
}