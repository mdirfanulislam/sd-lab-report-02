package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Multiplication_table_of_a_number {

    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);

        int n = multi.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
