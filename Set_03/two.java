package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class two {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.next();

        if (s.length() > 10) {
            char f = s.charAt(0);
            char l = s.charAt(s.length() - 1);
            int special = s.length() - 2;

            String result = "" + f + special + l;

            System.out.println("Abbreiation: " + result);
        } else {
            System.out.println("Original Word: " + s);
        }
    }
}
