public package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class three {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String w = n.next();

        String f = w.substring(0, 1).toUpperCase();
        String split = w.substring(1);
        String result = f + split;

        System.out.println("After Capitalize, the word is " + result);
    }
}
