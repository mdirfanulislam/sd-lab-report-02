package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class nine {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toLowerCase();

        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("vowels = " + v);
        System.out.println("consonants = " + c);
    }
}
