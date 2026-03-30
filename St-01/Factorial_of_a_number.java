package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Factorial_of_a_number {

    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);

        int n = fac.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
