package c251117.c251117_practice_problem_sheet;

import java.util.Scanner;

public class Print_Num_1_to_n {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = num.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
