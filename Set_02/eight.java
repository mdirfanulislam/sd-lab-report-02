package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class eight {

    public static void main(String arg[]) {
        
        Scanner palndrm = new Scanner(System.in);
        String s = palndrm.nextLine();
        
        int i = 0;
        int j = s.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}
