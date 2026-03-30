package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Sum_1_to_N {

    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);

        int n = sm.nextInt();

        System.out.println( n * (n + 1) / 2 );
    }
}
